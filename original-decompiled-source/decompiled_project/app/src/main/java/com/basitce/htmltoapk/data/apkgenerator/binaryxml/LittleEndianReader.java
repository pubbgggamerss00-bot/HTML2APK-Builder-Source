package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import kotlin.jvm.internal.r;
import p.g0;
import qg.m;

/* loaded from: classes.dex */
public final class LittleEndianReader {
    public static final int $stable = 8;
    private final byte[] data;

    public LittleEndianReader(byte[] data) {
        r.e(data, "data");
        this.data = data;
    }

    private final void check(int i10) {
        if (i10 < 0 || i10 >= this.data.length) {
            throw new IllegalArgumentException(e1.c.a(i10, this.data.length, "Binary resource is truncated at ", " of ").toString());
        }
    }

    public final int getSize() {
        return this.data.length;
    }

    public final byte[] slice(int i10, int i11) {
        if (i11 >= 0 && i10 >= 0) {
            int i12 = i10 + i11;
            byte[] bArr = this.data;
            if (i12 <= bArr.length) {
                return m.j(bArr, i10, i11 + i10);
            }
        }
        throw new IllegalArgumentException(x0.a.a(g0.a(i10, i11, "Binary resource is truncated at ", " (+", " of "), this.data.length, ")").toString());
    }

    public final int u16(int i10) {
        return (u8(i10 + 1) << 8) | u8(i10);
    }

    public final int u32(int i10) {
        return (u16(i10 + 2) << 16) | u16(i10);
    }

    public final int u8(int i10) {
        check(i10);
        return this.data[i10] & 255;
    }
}
