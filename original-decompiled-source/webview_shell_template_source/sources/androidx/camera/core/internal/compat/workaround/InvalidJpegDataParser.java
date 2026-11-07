package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class InvalidJpegDataParser {
    private final LargeJpegImageQuirk mQuirk = (LargeJpegImageQuirk) DeviceQuirks.get(LargeJpegImageQuirk.class);

    public static int getJfifEoiMarkEndPosition(byte[] bArr) {
        byte b7;
        int i6 = 2;
        while (i6 + 4 <= bArr.length && (b7 = bArr[i6]) == -1) {
            int i7 = i6 + 2;
            int i8 = ((bArr[i7] & 255) << 8) | (bArr[i6 + 3] & 255);
            if (b7 == -1 && bArr[i6 + 1] == -38) {
                while (true) {
                    int i9 = i7 + 2;
                    if (i9 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i7] == -1 && bArr[i7 + 1] == -39) {
                        return i9;
                    }
                    i7++;
                }
            } else {
                i6 += i8 + 2;
            }
        }
        return -1;
    }

    public int getValidDataLength(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.mQuirk;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.shouldCheckInvalidJpegData(bArr)) {
            return bArr.length;
        }
        int jfifEoiMarkEndPosition = getJfifEoiMarkEndPosition(bArr);
        return jfifEoiMarkEndPosition != -1 ? jfifEoiMarkEndPosition : bArr.length;
    }
}
