package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import eh.p;
import j2.y;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import pg.f0;
import qg.x;

/* loaded from: classes.dex */
public final class ResourceTableReader {
    public static final int $stable = 0;
    private static final int ENTRY_FLAG_COMPACT = 8;
    private static final int FLAG_OFFSET16 = 2;
    private static final int FLAG_SPARSE = 1;
    public static final ResourceTableReader INSTANCE = new ResourceTableReader();
    private static final int NO_ENTRY_16 = 65535;

    private ResourceTableReader() {
    }

    private final void forEachEntry(LittleEndianReader littleEndianReader, int i10, p<? super Integer, ? super Integer, f0> pVar) {
        int iU16 = littleEndianReader.u16(i10 + 2);
        int iU8 = littleEndianReader.u8(i10 + 9);
        int iU32 = littleEndianReader.u32(i10 + 12);
        int iU322 = littleEndianReader.u32(i10 + 16) + i10;
        int i11 = i10 + iU16;
        for (int i12 = 0; i12 < iU32; i12++) {
            if ((iU8 & 1) != 0) {
                int i13 = (i12 * 4) + i11;
                pVar.invoke(Integer.valueOf(littleEndianReader.u16(i13)), Integer.valueOf((littleEndianReader.u16(i13 + 2) * 4) + iU322));
            } else if ((iU8 & 2) != 0) {
                int iU162 = littleEndianReader.u16((i12 * 2) + i11);
                if (iU162 != 65535) {
                    pVar.invoke(Integer.valueOf(i12), Integer.valueOf((iU162 * 4) + iU322));
                }
            } else {
                int iU323 = littleEndianReader.u32((i12 * 4) + i11);
                if (iU323 != -1) {
                    pVar.invoke(Integer.valueOf(i12), Integer.valueOf(iU323 + iU322));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ad, code lost:
    
        throw new java.lang.IllegalArgumentException(j2.y.a(r1, "Corrupt resources.arsc package chunk at ").toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void readPackage(LittleEndianReader littleEndianReader, int i10, Map<String, Integer> map) {
        int i11;
        int i12;
        Object objE;
        String strB;
        int i13;
        int iU16 = littleEndianReader.u16(i10 + 2);
        int iU32 = littleEndianReader.u32(i10 + 4) + i10;
        int iU322 = littleEndianReader.u32(i10 + 8);
        List<String> stringPool = BinaryXmlFormatKt.readStringPool(littleEndianReader, littleEndianReader.u32(i10 + 268) + i10);
        List<String> stringPool2 = BinaryXmlFormatKt.readStringPool(littleEndianReader, littleEndianReader.u32(i10 + 276) + i10);
        int iU323 = iU16 >= 288 ? littleEndianReader.u32(i10 + 284) : 0;
        int i14 = i10 + iU16;
        while (true) {
            int i15 = i14 + 8;
            if (i15 > iU32) {
                return;
            }
            int iU324 = littleEndianReader.u32(i14 + 4);
            if (iU324 < 8 || i14 + iU324 > iU32) {
                break;
            }
            if (littleEndianReader.u16(i14) == 513) {
                int iU8 = littleEndianReader.u8(i15);
                Object objE2 = x.E((iU8 - 1) - iU323, stringPool);
                if (objE2 == null) {
                    throw new IllegalArgumentException(y.a(iU8, "Unknown resource type ").toString());
                }
                String str = (String) objE2;
                int iU162 = littleEndianReader.u16(i14 + 2);
                int iU82 = littleEndianReader.u8(i14 + 9);
                int iU325 = littleEndianReader.u32(i14 + 12);
                int iU326 = littleEndianReader.u32(i14 + 16) + i14;
                int i16 = iU162 + i14;
                int i17 = 0;
                while (i17 < iU325) {
                    int i18 = iU32;
                    int i19 = iU322;
                    List<String> list = stringPool;
                    if ((iU82 & 1) != 0) {
                        i11 = iU323;
                        int i20 = (i17 * 4) + i16;
                        int iU163 = littleEndianReader.u16(i20);
                        int iU164 = (littleEndianReader.u16(i20 + 2) * 4) + iU326;
                        i12 = iU326;
                        int iU165 = (littleEndianReader.u16(iU164 + 2) & 8) != 0 ? littleEndianReader.u16(iU164) : littleEndianReader.u32(iU164 + 4);
                        Object objE3 = x.E(iU165, stringPool2);
                        if (objE3 == null) {
                            throw new IllegalArgumentException(y.a(iU165, "Unknown resource key ").toString());
                        }
                        strB = b6.a.b("@", str, "/", (String) objE3);
                        i13 = (i19 << 24) | (iU8 << 16) | iU163;
                    } else {
                        i11 = iU323;
                        i12 = iU326;
                        if ((iU82 & 2) != 0) {
                            int iU166 = littleEndianReader.u16((i17 * 2) + i16);
                            if (iU166 != 65535) {
                                int i21 = (iU166 * 4) + i12;
                                int iU167 = (littleEndianReader.u16(i21 + 2) & 8) != 0 ? littleEndianReader.u16(i21) : littleEndianReader.u32(i21 + 4);
                                objE = x.E(iU167, stringPool2);
                                if (objE == null) {
                                    throw new IllegalArgumentException(y.a(iU167, "Unknown resource key ").toString());
                                }
                                strB = b6.a.b("@", str, "/", (String) objE);
                                i13 = (i19 << 24) | (iU8 << 16) | i17;
                            } else {
                                continue;
                                i17++;
                                iU32 = i18;
                                iU322 = i19;
                                stringPool = list;
                                iU323 = i11;
                                iU326 = i12;
                            }
                        } else {
                            int iU327 = littleEndianReader.u32((i17 * 4) + i16);
                            if (iU327 != -1) {
                                int i22 = i12 + iU327;
                                int iU168 = (littleEndianReader.u16(i22 + 2) & 8) != 0 ? littleEndianReader.u16(i22) : littleEndianReader.u32(i22 + 4);
                                objE = x.E(iU168, stringPool2);
                                if (objE == null) {
                                    throw new IllegalArgumentException(y.a(iU168, "Unknown resource key ").toString());
                                }
                                strB = b6.a.b("@", str, "/", (String) objE);
                                i13 = (i19 << 24) | (iU8 << 16) | i17;
                            } else {
                                continue;
                                i17++;
                                iU32 = i18;
                                iU322 = i19;
                                stringPool = list;
                                iU323 = i11;
                                iU326 = i12;
                            }
                        }
                    }
                    map.putIfAbsent(strB, Integer.valueOf(i13));
                    i17++;
                    iU32 = i18;
                    iU322 = i19;
                    stringPool = list;
                    iU323 = i11;
                    iU326 = i12;
                }
            }
            i14 += iU324;
            iU32 = iU32;
            iU322 = iU322;
            stringPool = stringPool;
            iU323 = iU323;
        }
    }

    public final Map<String, Integer> read(InputStream input) {
        r.e(input, "input");
        return read(ah.b.b(input));
    }

    public final Map<String, Integer> read(byte[] bytes) {
        r.e(bytes, "bytes");
        LittleEndianReader littleEndianReader = new LittleEndianReader(bytes);
        if (littleEndianReader.getSize() < 12 || littleEndianReader.u16(0) != 2) {
            throw new IllegalArgumentException("Not a resources.arsc file");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iU16 = littleEndianReader.u16(2);
        while (iU16 + 8 <= littleEndianReader.getSize()) {
            int iU32 = littleEndianReader.u32(iU16 + 4);
            if (iU32 < 8 || iU16 + iU32 > littleEndianReader.getSize()) {
                throw new IllegalArgumentException(y.a(iU16, "Corrupt resources.arsc chunk at ").toString());
            }
            if (littleEndianReader.u16(iU16) == 512) {
                readPackage(littleEndianReader, iU16, linkedHashMap);
            }
            iU16 += iU32;
        }
        return linkedHashMap;
    }
}
