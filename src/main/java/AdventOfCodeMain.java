import helpers.FileHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static helpers.Constants.FILE_NAME;

public class AdventOfCodeMain {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = FileHelper.readFile(FILE_NAME);
        Scanner scanner = null;
        if (inputFile.exists()) {
            scanner = FileHelper.scanFile(inputFile);
            assert scanner != null;
        }
        List<Integer> inputList = new ArrayList<Integer>();

        while(scanner.hasNext()) {
            inputList.add(Integer.parseInt(scanner.next()));
        }

        System.out.println("Part one answer: " + calculatePartOneAnswerOne(inputList));

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
}
