package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import j2.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class BinaryXmlFormatKt {
    public static final List<String> readStringPool(LittleEndianReader reader, int i10) {
        r.e(reader, "reader");
        if (reader.u16(i10) != 1) {
            throw new IllegalArgumentException(y.a(i10, "Expected a string pool at ").toString());
        }
        int iU32 = reader.u32(i10 + 8);
        int iU322 = reader.u32(i10 + 16);
        int iU323 = reader.u32(i10 + 20) + i10;
        boolean z10 = (iU322 & 256) != 0;
        int iU16 = reader.u16(i10 + 2) + i10;
        ArrayList arrayList = new ArrayList(iU32);
        for (int i11 = 0; i11 < iU32; i11++) {
            int iU324 = reader.u32((i11 * 4) + iU16) + iU323;
            arrayList.add(z10 ? readUtf8(reader, iU324) : readUtf16(reader, iU324));
        }
        return arrayList;
    }

    private static final String readUtf16(LittleEndianReader littleEndianReader, int i10) {
        int iU16 = littleEndianReader.u16(i10);
        int i11 = i10 + 2;
        if ((32768 & iU16) != 0) {
            iU16 = ((iU16 & 32767) << 16) | littleEndianReader.u16(i11);
            i11 = i10 + 4;
        }
        return new String(littleEndianReader.slice(i11, iU16 * 2), mh.a.f18239c);
    }

    private static final String readUtf8(LittleEndianReader littleEndianReader, int i10) {
        int i11;
        int i12 = i10 + ((littleEndianReader.u8(i10) & 128) != 0 ? 2 : 1);
        int iU8 = littleEndianReader.u8(i12);
        if ((iU8 & 128) != 0) {
            iU8 = ((iU8 & CertificateBody.profileType) << 8) | littleEndianReader.u8(i12 + 1);
            i11 = i12 + 2;
        } else {
            i11 = i12 + 1;
        }
        return new String(littleEndianReader.slice(i11, iU8), mh.a.f18238b);
    }
}
