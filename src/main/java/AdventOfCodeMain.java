import helpers.FileHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static helpers.Constants.FILE_NAME;

public class AdventOfCodeMain {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = null;
        List<Integer> inputList = new ArrayList<Integer>();
        File inputFile = FileHelper.readFile(FILE_NAME);
        if (inputFile.exists()) {
            scanner = FileHelper.scanFile(inputFile);
        }

        while(scanner != null && scanner.hasNext()) {
            inputList.add(Integer.parseInt(scanner.next()));
        }

        // Part 1
        System.out.println("Part 1 answer: " + calculatePartOneAnswerOne(inputList));

        // Part 2 - same input
        System.out.println("Part 2 answer: " + calculatePartOneAnswerTwo(inputList));
    }

     private static Integer calculatePartOneAnswerOne(final List<Integer> partOneInput) {
        Integer resultCounter = 0;
         for (int i = 0; i < partOneInput.size()-1; i ++) {
            if (partOneInput.get(i)<partOneInput.get(i+1)){
                resultCounter++;
            }
         }
        return resultCounter;
    }

    private static Integer calculatePartOneAnswerTwo(final List<Integer> partTwoInput) {
        Integer resultCounter = 0;
        int firstSum;
        int secondSum;
        for (int i = 0; i < partTwoInput.size()-3; i ++) {
            firstSum = partTwoInput.get(i) + partTwoInput.get(i+1) + partTwoInput.get(i+2);
            secondSum = partTwoInput.get(i+1) + partTwoInput.get(i+2) + partTwoInput.get(i+3);
            if (firstSum<secondSum){
                resultCounter++;
            }
        }
        return resultCounter;
    }
}
