import helpers.FileHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static helpers.Constants.FILE_NAME;

public class AdventOfCodeMain {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = FileHelper.readFile(FILE_NAME);
        Scanner scanner;
        if (inputFile.exists()) {
            scanner = FileHelper.scanFile(inputFile);
            assert scanner != null;
        }


    }
}
