package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class LittleEndianWriter {
    public static final int $stable = 8;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    public final void bytes(byte[] value) throws IOException {
        r.e(value, "value");
        this.out.write(value);
    }

    public final int getSize() {
        return this.out.size();
    }

    public final void padTo4() {
        while (this.out.size() % 4 != 0) {
            this.out.write(0);
        }
    }

    public final byte[] toByteArray() {
        byte[] byteArray = this.out.toByteArray();
        r.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final void u16(int i10) {
        this.out.write(i10 & 255);
        this.out.write((i10 >>> 8) & 255);
    }

    public final void u32(int i10) {
        u16(i10);
        u16(i10 >>> 16);
    }

    public final void u8(int i10) {
        this.out.write(i10 & 255);
    }
}
