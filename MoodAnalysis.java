package bridgeLabz;
import org.junit.Assert;
import org.junit.Test;

import bridgeLabz.MoodAnalyser;

public class MoodAnalysis {
	
	@Test
	public void test1(){
		String mood = null;
		try {
			mood = MoodAnalyser.analyseMood("I am in a sad mood");
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void test2(){
		String mood = null;
		try {
			mood = MoodAnalyser.analyseMood("I am in a happy mood");
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}
}
