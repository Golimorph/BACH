
all : Nifti_Reader.class Nifti_Writer.class NiftiHeader.class AffineCoors.class QuaternCoors.class CoordinateMapper.class Coordinate_Viewer.class plugins.config 
	jar cfM nifti_io.jar Nifti_Reader.java Nifti_Reader.class Nifti_Writer.java Nifti_Writer.class NiftiHeader.java NiftiHeader.class AffineCoors.java AffineCoors.class QuaternCoors.java QuaternCoors.class CoordinateMapper.java CoordinateMapper.class Coordinate_Viewer.java Coordinate_Viewer.class Makefile plugins.config

Nifti_Reader.class : Nifti_Reader.java
	javac Nifti_Reader.java

Nifti_Writer.class : Nifti_Writer.java
	javac Nifti_Writer.java

NiftiHeader.class : NiftiHeader.java
	javac NiftiHeader.java

AffineCoors.class : AffineCoors.java
	javac AffineCoors.java

QuaternCoors.class : QuaternCoors.java
	javac QuaternCoors.java

CoordinateMapper.class : CoordinateMapper.java
	javac CoordinateMapper.java

Coordinate_Viewer.class : Coordinate_Viewer.java
	javac Coordinate_Viewer.java

