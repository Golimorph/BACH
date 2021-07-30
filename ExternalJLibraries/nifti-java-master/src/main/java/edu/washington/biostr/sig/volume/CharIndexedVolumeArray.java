package edu.washington.biostr.sig.volume;

import java.io.IOException;

import javax.vecmath.Matrix4d;

/**
 * Support a unsigned 16 bit integer based volume array.  
 * They are stored as chars.<br>
 * See the documentation for VolumeArray for more data.
 * @author Eider Moore
 * @version 1.0
 */
class CharIndexedVolumeArray
        extends IndexedVolumeArray {

    private char[] array;

    /**
     * 
     * @param maxX The maximum for the x dimension (fastest changing of the spacial indices)
     * @param maxY The maximum for the y dimension.
     * @param maxZ The maximum for the z dimension (slowest changing of the spacial indices).
     * @param maxTime The maximum for the time dimension.  Usually 1.
     * @param maxI5 The maximum for the 5th dimension.  Usually 1.
     * @param index2space The transform, usually turns indices to mm coordinates.  Must be invertable.
     * @param array The data
     */
    public CharIndexedVolumeArray(int maxX, int maxY, int maxZ, int maxTime, int maxI5,
            Matrix4d index2space, char[] array) {
        super(maxX, maxY, maxZ, maxTime, maxI5, index2space);
        this.array = array;
        setMinMax(false);
    }

    public int getInt(int index) {
        return array[index];
    }

    public double getDouble(int index) {
        return array[index];
    }

    public DataType getNaturalType() {
        return DataType.TYPE_INT;
    }

    public DataType getType() {
        return DataType.TYPE_USHORT;
    }

    @Override
    public void write(ByteEncoder out) throws IOException {
        for (char value : array) {
            out.write(value);
        }
    }

    @Override
    public void setData(int index, double value) {
        char v = (char) Math.round(value);
        array[index] = v;
    }

    @Override
    public void setData(int index, int value) {
        array[index] = (char) value;
    }
    
    @Override
    public Object getDataArray() {
    	return array;
    }

}
