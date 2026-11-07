package org.jf.dexlib2.dexbacked;

import h1.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.raw.OdexHeaderItem;
import org.jf.dexlib2.dexbacked.util.VariableSizeList;
import org.jf.dexlib2.util.DexUtil;

/* loaded from: classes3.dex */
public class DexBackedOdexFile extends DexBackedDexFile {
    private static final int DEPENDENCY_COUNT_OFFSET = 12;
    private static final int DEPENDENCY_START_OFFSET = 16;
    private final byte[] odexBuf;

    public static class NotAnOdexFile extends RuntimeException {
        public NotAnOdexFile() {
        }

        public NotAnOdexFile(Throwable th2) {
            super(th2);
        }

        public NotAnOdexFile(String str) {
            super(str);
        }

        public NotAnOdexFile(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public DexBackedOdexFile(Opcodes opcodes, byte[] bArr, byte[] bArr2) {
        super(opcodes, bArr2);
        this.odexBuf = bArr;
    }

    public static DexBackedOdexFile fromInputStream(Opcodes opcodes, InputStream inputStream) throws IOException {
        DexUtil.verifyOdexHeader(inputStream);
        inputStream.reset();
        byte[] bArr = new byte[40];
        oc.a.a(inputStream, bArr);
        int dexOffset = OdexHeaderItem.getDexOffset(bArr);
        if (dexOffset > 40) {
            long j10 = dexOffset - 40;
            byte[] bArr2 = new byte[8192];
            long j11 = 0;
            while (j11 < j10) {
                long j12 = j10 - j11;
                int iAvailable = inputStream.available();
                long jSkip = iAvailable == 0 ? 0L : inputStream.skip(Math.min(iAvailable, j12));
                if (jSkip == 0) {
                    jSkip = inputStream.read(bArr2, 0, (int) Math.min(j12, 8192));
                    if (jSkip == -1) {
                        break;
                    }
                }
                j11 += jSkip;
            }
            if (j11 < j10) {
                throw new EOFException(com.android.apksig.internal.apk.a.a(j10, " bytes expected", y.a("reached end of stream after skipping ", " bytes; ", j11)));
            }
        }
        return new DexBackedOdexFile(opcodes, bArr, oc.a.c(inputStream));
    }

    public List<String> getDependencies() {
        int dependenciesOffset = OdexHeaderItem.getDependenciesOffset(this.odexBuf) - OdexHeaderItem.getDexOffset(this.odexBuf);
        final DexBuffer dexBuffer = new DexBuffer(getBuffer().buf, 0);
        return new VariableSizeList<String>(getDataBuffer(), dependenciesOffset + 16, dexBuffer.readInt(dependenciesOffset + 12)) { // from class: org.jf.dexlib2.dexbacked.DexBackedOdexFile.1
            @Override // org.jf.dexlib2.dexbacked.util.VariableSizeList
            public String readNextItem(DexReader dexReader, int i10) {
                int i11 = dexReader.readInt();
                int offset = dexReader.getOffset();
                dexReader.moveRelative(i11 + 20);
                try {
                    return new String(dexBuffer.buf, offset, i11 - 1, "US-ASCII");
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        };
    }

    public int getOdexVersion() {
        return OdexHeaderItem.getVersion(this.odexBuf, 0);
    }

    @Override // org.jf.dexlib2.dexbacked.DexBackedDexFile
    public boolean supportsOptimizedOpcodes() {
        return true;
    }
}
