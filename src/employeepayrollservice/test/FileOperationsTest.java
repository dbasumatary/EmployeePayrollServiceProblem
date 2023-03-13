package employeepayrollservice.test;

import java.io.File;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class FileOperationsTest {

    //Checking if the file exists
    @Test
    public void testCheckFileExists() {
        File file = new File("C:\\Users\\MSI\\Desktop\\RFP255\\sample.txt");
        boolean fileExists = file.exists();
        Assert.assertFalse(fileExists);
    }

    //Creating a new file and deleting it
    @Test
    public void testCreateAndDeleteFile() throws IOException {
        File file = new File("C:\\Users\\MSI\\Desktop\\RFP255\\sample.txt");
        boolean created = file.createNewFile();
        Assert.assertTrue(created);

        boolean deleted = file.delete();
        Assert.assertTrue(deleted);

        boolean fileExists = file.exists();
        Assert.assertFalse(fileExists);
    }

    //Creating a new test directory
    @Test
    public void testCreateDirectory() {
        File dir = new File("C:\\Users\\MSI\\Desktop\\RFP255\\new");
        boolean created = dir.mkdir();
        Assert.assertTrue(created);

        boolean dirExists = dir.exists();
        Assert.assertTrue(dirExists);
    }

    //Creating a new empty file
    @Test
    public void testCreateEmptyFile() throws IOException {
        File file = new File("C:\\Users\\MSI\\Desktop\\RFP255\\test.txt");
        boolean created = file.createNewFile();
        Assert.assertTrue(created);

        boolean fileExists = file.exists();
        Assert.assertTrue(fileExists);

        boolean deleted = file.delete();
        Assert.assertTrue(deleted);
    }

    //Listing all files and directories
    @Test
    public void testListFilesAndDirectories() {
        File directory = new File("C:\\Users\\MSI\\Desktop\\RFP255\\");
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
            } else {
                System.out.println("File: " + file.getName());
            }
        }

        //Display all files ending with .txt
        File[] txtFiles = directory.listFiles((dir, name) -> name.endsWith(".txt"));
        for (File file : txtFiles) {
            System.out.println("Text File: " + file.getName());
        }
    }
}

