# Load data from csv file
data <- read.csv("HW_DOE_405.csv")

# Calculate means and standard deviations for each factor setting
means <- aggregate(Response ~ Factor.A + Factor.B + Factor.C + Factor.D, data, mean)
sds <- aggregate(Response ~ Factor.A + Factor.B + Factor.C + Factor.D, data, sd)

# Combine means and standard deviations into a single data frame
summary_data <- data.frame(means, sds[, 2])

# Rename columns
colnames(summary_data) <- c("Factor.A", "Factor.B", "Factor.C", "Factor.D", "Mean", "SD")

# Calculate main effects and interaction effects
summary_data$AB <- (summary_data$Mean[2] + summary_data$Mean[3] - summary_data$Mean[1] - summary_data$Mean[4])/4
summary_data$AC <- (summary_data$Mean[2] + summary_data$Mean[5] - summary_data$Mean[1] - summary_data$Mean[6])/4
summary_data$AD <- (summary_data$Mean[3] + summary_data$Mean[5] - summary_data$Mean[1] - summary_data$Mean[7])/4
summary_data$BC <- (summary_data$Mean[3] + summary_data$Mean[6] - summary_data$Mean[1] - summary_data$Mean[8])/4
summary_data$BD <- (summary_data$Mean[4] + summary_data$Mean[6] - summary_data$Mean[2] - summary_data$Mean[8])/4
summary_data$CD <- (summary_data$Mean[4] + summary_data$Mean[5] - summary_data$Mean[3] - summary_data$Mean[8])/4
summary_data$ABC <- (summary_data$Mean[7] + summary_data$Mean[8] - summary_data$Mean[5] - summary_data$Mean[6])/4
summary_data$ABD <- (summary_data$Mean[6] + summary_data$Mean[8] - summary_data$Mean[4] - summary_data$Mean[7])/4
summary_data$ACD <- (summary_data$Mean[5] + summary_data$Mean[8] - summary_data$Mean[3] - summary_data$Mean[7])/4
summary_data$BCD <- (summary_data$Mean[4] + summary_data$Mean[8] - summary_data$Mean[2] - summary_data$Mean[7])/4
summary_data$ABCD <- (summary_data$Mean[8] - summary_data$Mean[7] - summary_data$Mean[6] + summary_data$Mean[5] - summary_data$Mean[4] + summary_data$Mean[3] + summary_data$Mean[2] - summary_data$Mean[1])/8

# Create normal probability plots
par(mfrow = c(2, 5))
for (i in 5:14) {
  qqnorm(summary_data[, i], main = colnames(summary_data)[i], ylab = "Response", xlab = "Theoretical Quantiles")
  qqline(summary_data[, i])
}