package x4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes.dex */
public final class i {
    public static y4.b a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j10;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & HPKE.aead_EXPORT_ONLY;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j10 = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j10 = byteBufferDuplicate.getInt() & BodyPartID.bodyIdMax;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j10 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j10 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j11 = byteBufferDuplicate.getInt() & BodyPartID.bodyIdMax;
            for (int i13 = 0; i13 < j11; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j12 = byteBufferDuplicate.getInt() & BodyPartID.bodyIdMax;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j12 + j10));
                    y4.b bVar = new y4.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f33936b = byteBufferDuplicate;
                    bVar.f33935a = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f33937c = i15;
                    bVar.f33938d = bVar.f33936b.getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
