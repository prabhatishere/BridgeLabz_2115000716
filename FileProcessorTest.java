package com.lcwd.test;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    FileProcessor processor = new FileProcessor();
    String filename = "testfile.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, World!";
        processor.writeToFile(filename, content);
        assertEquals(content, processor.readFromFile(filename));
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        processor.writeToFile(filename, "Test Content");
        assertTrue(new File(filename).exists());
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> processor.readFromFile("nonexistent.txt"));
    }
}
