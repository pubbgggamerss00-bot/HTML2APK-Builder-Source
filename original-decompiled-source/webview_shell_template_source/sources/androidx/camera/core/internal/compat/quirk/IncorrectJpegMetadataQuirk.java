package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {
    private static final Set<String> SAMSUNG_DEVICES = new HashSet(Arrays.asList("A24"));

    private boolean canParseSosMarker(byte[] bArr) {
        byte b7;
        int i6 = 2;
        while (i6 + 4 <= bArr.length && (b7 = bArr[i6]) == -1) {
            if (b7 == -1 && bArr[i6 + 1] == -38) {
                return true;
            }
            i6 += (((bArr[i6 + 2] & 255) << 8) | (bArr[i6 + 3] & 255)) + 2;
        }
        return false;
    }

    private int findSecondFfd8Position(byte[] bArr) {
        int i6 = 2;
        while (true) {
            int i7 = i6 + 1;
            if (i7 > bArr.length) {
                return -1;
            }
            if (bArr[i6] == -1 && bArr[i7] == -40) {
                return i6;
            }
            i6 = i7;
        }
    }

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && SAMSUNG_DEVICES.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean load() {
        return isSamsungProblematicDevice();
    }

    public byte[] jpegImageToJpegByteArray(ImageProxy imageProxy) {
        int iFindSecondFfd8Position = 0;
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return (canParseSosMarker(bArr) || (iFindSecondFfd8Position = findSecondFfd8Position(bArr)) != -1) ? Arrays.copyOfRange(bArr, iFindSecondFfd8Position, buffer.limit()) : bArr;
    }
}
