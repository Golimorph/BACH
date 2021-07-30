
//method1----------------------------------------------------------------

/*
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.File;


import java.lang.ClassLoader;


import edu.washington.biostr.sig.nifti.*;
import edu.washington.biostr.sig.nifti.NiftiIO.VolumePair;
import edu.washington.biostr.sig.volume.*;
*/

//method2----------------------------------------------------------------
/*
import com.ericbarnhill.niftijio.*;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
*/
//
//method 3 ---------------------------------------------------------------------
import ij.ImageStack;
//"/Users/richardedberg/Documents/Java/BACH/brains/","200227-yuanjingLi_t1.nii"
//------------------------------


public class Brain {
	private Nifti_Reader reader;
	////private ImageStack stack;
	public Brain(){
		 reader= new Nifti_Reader();
		 reader.run("/Users/richardedberg/Documents/Java/BACH/brains/200227-yuanjingLi_t1.nii");
		 
	}

	public double getDouble(int x, int y, int z){
	    return reader.getStack().getVoxel(x, y, z);
	}

	public int[] getResolution(){
		int[] dimensions = {reader.getStack().getWidth(), reader.getStack().getHeight(), reader.getStack().size()};
	    return dimensions;
	}

	public void startNewBrain()
	{
		reader= new Nifti_Reader();
		reader.run("");
	}
}













