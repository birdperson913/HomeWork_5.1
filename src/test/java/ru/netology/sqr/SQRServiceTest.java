package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
        @ParameterizedTest
        @CsvFileSource (files="src/test/resources/sqares.txt")
        public void testSQRService(int lowerBound, int upperBound , int expented){
                SQRService sqrService =new SQRService();
                int actual = sqrService.summSquareRoot(lowerBound,upperBound);
                Assertions.assertEquals(expented,actual);
        }
}
