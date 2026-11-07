package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    public ExifTag(String str, int i6, int i7) {
        this.name = str;
        this.number = i6;
        this.primaryFormat = i7;
        this.secondaryFormat = -1;
    }

    public boolean isFormatCompatible(int i6) {
        int i7;
        int i8 = this.primaryFormat;
        if (i8 == 7 || i6 == 7 || i8 == i6 || (i7 = this.secondaryFormat) == i6) {
            return true;
        }
        if ((i8 == 4 || i7 == 4) && i6 == 3) {
            return true;
        }
        if ((i8 == 9 || i7 == 9) && i6 == 8) {
            return true;
        }
        return (i8 == 12 || i7 == 12) && i6 == 11;
    }

    public ExifTag(String str, int i6, int i7, int i8) {
        this.name = str;
        this.number = i6;
        this.primaryFormat = i7;
        this.secondaryFormat = i8;
    }
}
