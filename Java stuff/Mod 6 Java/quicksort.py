
def partition(numbers, low, high):
    pivot = numbers[high]
    i = low - 1
    for j in range(low, high):
        if numbers[j] < pivot:
            i += 1
            numbers[i] , numbers[j] = numbers[j], numbers[i]
    numbers[i + 1], numbers[high] = numbers[high], numbers[i + 1]
    return i + 1

def main():
    numbers = (76, 52, 53, 41, 31, 24, 45, 88)
    pivot = partition(numbers, 0, 6)
    print(f"Pivot: {pivot}, Low partition: {numbers[pivot]}, High partition: {numbers[pivot+1:]}")

