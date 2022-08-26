package com.thetestingacademy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

//# Run tests and generate .xml reports
//mvn test
//
//# Convert .xml reports into .html report, but without the CSS or images
//mvn surefire-report:report-only
//
//# Put the CSS and images where they need to be without the rest of the
//# time-consuming stuff
//mvn site -DgenerateReports=false

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
