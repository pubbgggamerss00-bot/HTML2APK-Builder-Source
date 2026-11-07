package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
abstract class LowmcConstants {
    protected KMatrices KMatrix;
    protected KMatrices KMatrix_full;
    protected KMatrices KMatrix_inv;
    protected KMatrices LMatrix;
    protected KMatrices LMatrix_full;
    protected KMatrices LMatrix_inv;
    protected KMatrices RConstants;
    protected KMatrices RConstants_full;
    protected int[] keyMatrices;
    protected int[] keyMatrices_full;
    protected int[] keyMatrices_inv;
    protected int[] linearMatrices;
    protected int[] linearMatrices_full;
    protected int[] linearMatrices_inv;
    protected int[] roundConstants;
    protected int[] roundConstants_full;

    private KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i10) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i10 * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    public static int[] ReadFromProperty(Properties properties, String str, int i10) {
        byte[] bArrDecode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < bArrDecode.length / 4; i11++) {
            iArr[i11] = Pack.littleEndianToInt(bArrDecode, i11 * 4);
        }
        return iArr;
    }

    public static int[] readArray(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 != i10; i11++) {
            iArr[i11] = dataInputStream.readInt();
        }
        return iArr;
    }

    private static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != str.length(); i10++) {
            if (str.charAt(i10) != ',') {
                byteArrayOutputStream.write(str.charAt(i10));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KMatricesWithPointer KMatrix(PicnicEngine picnicEngine, int i10) {
        KMatrices kMatrices;
        int i11 = picnicEngine.stateSizeBits;
        if (i11 != 128) {
            if (i11 != 129) {
                if (i11 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.KMatrix;
                    }
                } else if (i11 != 255) {
                    if (i11 != 256) {
                        return null;
                    }
                    kMatrices = this.KMatrix;
                }
            }
            kMatrices = this.KMatrix_full;
        }
        return GET_MAT(kMatrices, i10);
    }

    public KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        int i10 = picnicEngine.stateSizeBits;
        if (i10 == 129 || ((i10 == 192 && picnicEngine.numRounds == 4) || i10 == 255)) {
            return GET_MAT(this.KMatrix_inv, 0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KMatricesWithPointer LMatrix(PicnicEngine picnicEngine, int i10) {
        KMatrices kMatrices;
        int i11 = picnicEngine.stateSizeBits;
        if (i11 != 128) {
            if (i11 != 129) {
                if (i11 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.LMatrix;
                    }
                } else if (i11 != 255) {
                    if (i11 != 256) {
                        return null;
                    }
                    kMatrices = this.LMatrix;
                }
            }
            kMatrices = this.LMatrix_full;
        }
        return GET_MAT(kMatrices, i10);
    }

    public KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i10) {
        int i11 = picnicEngine.stateSizeBits;
        if (i11 == 129 || ((i11 == 192 && picnicEngine.numRounds == 4) || i11 == 255)) {
            return GET_MAT(this.LMatrix_inv, i10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KMatricesWithPointer RConstant(PicnicEngine picnicEngine, int i10) {
        KMatrices kMatrices;
        int i11 = picnicEngine.stateSizeBits;
        if (i11 != 128) {
            if (i11 != 129) {
                if (i11 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.RConstants;
                    }
                } else if (i11 != 255) {
                    if (i11 != 256) {
                        return null;
                    }
                    kMatrices = this.RConstants;
                }
            }
            kMatrices = this.RConstants_full;
        }
        return GET_MAT(kMatrices, i10);
    }
}
