package test;

import wci.frontend.Source;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SourceTest {
    public static void main(String[] args) throws IOException {
        Source source = new Source(new BufferedReader(new InputStreamReader(SourceTest.class.getClassLoader().getResourceAsStream("SourceTest.txt"))));
    }
}
