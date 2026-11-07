package androidx.camera.core;

import androidx.camera.camera2.internal.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class DynamicRange {
    public static final int BIT_DEPTH_10_BIT = 10;
    public static final int BIT_DEPTH_8_BIT = 8;
    public static final int BIT_DEPTH_UNSPECIFIED = 0;
    public static final int ENCODING_DOLBY_VISION = 6;
    public static final int ENCODING_HDR10 = 4;
    public static final int ENCODING_HDR10_PLUS = 5;
    public static final int ENCODING_HDR_UNSPECIFIED = 2;
    public static final int ENCODING_HLG = 3;
    public static final int ENCODING_SDR = 1;
    public static final int ENCODING_UNSPECIFIED = 0;
    private final int mBitDepth;
    private final int mEncoding;
    public static final DynamicRange UNSPECIFIED = new DynamicRange(0, 0);
    public static final DynamicRange SDR = new DynamicRange(1, 8);
    public static final DynamicRange HDR_UNSPECIFIED_10_BIT = new DynamicRange(2, 10);
    public static final DynamicRange HLG_10_BIT = new DynamicRange(3, 10);
    public static final DynamicRange HDR10_10_BIT = new DynamicRange(4, 10);
    public static final DynamicRange HDR10_PLUS_10_BIT = new DynamicRange(5, 10);
    public static final DynamicRange DOLBY_VISION_10_BIT = new DynamicRange(6, 10);
    public static final DynamicRange DOLBY_VISION_8_BIT = new DynamicRange(6, 8);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BitDepth {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DynamicRangeEncoding {
    }

    public DynamicRange(int i6, int i7) {
        this.mEncoding = i6;
        this.mBitDepth = i7;
    }

    private static String getEncodingLabel(int i6) {
        switch (i6) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DynamicRange) {
            DynamicRange dynamicRange = (DynamicRange) obj;
            if (this.mEncoding == dynamicRange.getEncoding() && this.mBitDepth == dynamicRange.getBitDepth()) {
                return true;
            }
        }
        return false;
    }

    public int getBitDepth() {
        return this.mBitDepth;
    }

    public int getEncoding() {
        return this.mEncoding;
    }

    public int hashCode() {
        return ((this.mEncoding ^ 1000003) * 1000003) ^ this.mBitDepth;
    }

    public boolean is10BitHdr() {
        return isFullySpecified() && getEncoding() != 1 && getBitDepth() == 10;
    }

    public boolean isFullySpecified() {
        return (getEncoding() == 0 || getEncoding() == 2 || getBitDepth() == 0) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        sb.append(getEncodingLabel(this.mEncoding));
        sb.append(", bitDepth=");
        return p0.a(sb, this.mBitDepth, "}");
    }
}
