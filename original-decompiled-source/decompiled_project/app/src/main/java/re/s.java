package re;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f23523a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23524b;

    public s(String str, String str2) {
        this.f23523a = str;
        this.f23524b = str2;
    }

    public static Integer b(ArrayList arrayList) throws IOException {
        Object objRemove = arrayList.remove(arrayList.size() - 1);
        if (objRemove instanceof Integer) {
            return (Integer) objRemove;
        }
        o oVar = (o) objRemove;
        int[] iArr = oVar.f23508a.f23509a;
        if (iArr[0] == 12 && iArr[1] == 12) {
            return Integer.valueOf(((Integer) arrayList.remove(arrayList.size() - 1)).intValue() / ((Integer) arrayList.remove(arrayList.size() - 1)).intValue());
        }
        throw new IOException("Unexpected char string command: " + oVar.f23508a);
    }

    public final void a(byte[] bArr, List list, ArrayList arrayList) throws IOException {
        Integer numValueOf;
        p pVar = new p(bArr);
        while (pVar.f23511b < pVar.f23510a.length) {
            int iF = pVar.f();
            String str = this.f23523a;
            String str2 = this.f23524b;
            if (iF == 10) {
                Object objRemove = arrayList.remove(arrayList.size() - 1);
                if (objRemove instanceof Integer) {
                    Integer num = (Integer) objRemove;
                    if (num.intValue() < 0 || num.intValue() >= list.size()) {
                        Log.w("PdfBox-Android", "CALLSUBR is ignored, operand: " + num + ", subrs.size(): " + list.size() + " in glyph '" + str2 + "' of font " + str);
                        while (l.b.b(arrayList, 1) instanceof Integer) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    } else {
                        a((byte[]) list.get(num.intValue()), list, arrayList);
                        Object obj = arrayList.get(arrayList.size() - 1);
                        if ((obj instanceof o) && ((o) obj).f23508a.f23509a[0] == 11) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                } else {
                    Log.w("PdfBox-Android", "Parameter " + objRemove + " for CALLSUBR is ignored, integer expected in glyph '" + str2 + "' of font " + str);
                }
            } else if (iF == 12 && pVar.a(0) == 16) {
                pVar.c();
                Integer num2 = (Integer) arrayList.remove(arrayList.size() - 1);
                Integer num3 = (Integer) arrayList.remove(arrayList.size() - 1);
                ArrayDeque arrayDeque = new ArrayDeque();
                int iIntValue = num2.intValue();
                if (iIntValue == 0) {
                    arrayDeque.push(b(arrayList));
                    arrayDeque.push(b(arrayList));
                    arrayList.remove(arrayList.size() - 1);
                    arrayList.add(0);
                    arrayList.add(new o(12, 16));
                } else if (iIntValue == 1) {
                    arrayList.add(1);
                    arrayList.add(new o(12, 16));
                } else if (iIntValue != 3) {
                    for (int i10 = 0; i10 < num3.intValue(); i10++) {
                        arrayDeque.push(b(arrayList));
                    }
                } else {
                    arrayDeque.push(b(arrayList));
                }
                while (pVar.a(0) == 12 && pVar.a(1) == 17) {
                    pVar.c();
                    pVar.c();
                    arrayList.add(arrayDeque.pop());
                }
                if (arrayDeque.size() > 0) {
                    Log.w("PdfBox-Android", "Value left on the PostScript stack in glyph " + str2 + " of font " + str);
                }
            } else if (iF >= 0 && iF <= 31) {
                arrayList.add(iF == 12 ? new o(iF, pVar.f()) : new o(iF));
            } else {
                if (iF < 32 || iF > 255) {
                    throw new IllegalArgumentException();
                }
                if (iF >= 32 && iF <= 246) {
                    numValueOf = Integer.valueOf(iF - 139);
                } else if (iF >= 247 && iF <= 250) {
                    numValueOf = Integer.valueOf(((iF - 247) * 256) + pVar.f() + HeaderItem.DATA_START_OFFSET);
                } else if (iF >= 251 && iF <= 254) {
                    numValueOf = Integer.valueOf((((-(iF - 251)) * 256) - pVar.f()) - 108);
                } else {
                    if (iF != 255) {
                        throw new IllegalArgumentException();
                    }
                    numValueOf = Integer.valueOf(pVar.e());
                }
                arrayList.add(numValueOf);
            }
        }
    }
}
