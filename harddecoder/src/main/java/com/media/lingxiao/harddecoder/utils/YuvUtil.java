package com.media.lingxiao.harddecoder.utils;

public class YuvUtil {
    static {
        System.loadLibrary("yuv-lib");
    }

    @Deprecated
    public static native byte[] rotateYuv90(byte[] nv21,int width,int height);
    @Deprecated
    public static native byte[] rotateYUVDegree270AndMirror(byte[] nv21,int width,int height);
    @Deprecated
    public static native void NV21ToNV12(byte[] nv21, byte[] nv12, int width, int height);


    public static native void NV21ToI420(byte[] input, byte[] output, int width, int height);
    public static native void RotateI420(byte[] input, byte[] output, int width, int height, int rotation);
    public static native void NV21ToI420RotateAndConvertToNv12(byte[] input, byte[] output, int width, int height);
    public static native void NV21ToI420RotateAndMirrorConvertToNv12(byte[] input, byte[] output, int width, int height);
}
