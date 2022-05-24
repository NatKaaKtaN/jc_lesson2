package lesson2;

public class SizeDateException {
    public static int getSizeDate(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        if (arr.length != 4 && arr[0].length != 4){
                throw new MyArraySizeException("Длина неправильная");
        }

        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length != 4){
                throw new MyArraySizeException("Длина неправильная");
            }
            for (int j = 0; j < arr[i].length ; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Проверьте ячейку " + i + "x" + j + " на числовое значение");
                }
            }
        }

        Integer[][] intArray = new Integer[arr.length][arr[0].length];
        int res = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                intArray[i][j] = Integer.parseInt(arr[i][j]);
                res += intArray[i][j];
            }
        }
        return sum;
    }
}

