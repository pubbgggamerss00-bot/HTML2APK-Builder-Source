package re;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import re.o;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public int f23530a;

    /* renamed from: b, reason: collision with root package name */
    public int f23531b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23532c;

    public static Number d(int i10, p pVar) throws IOException {
        if (i10 == 28) {
            return Integer.valueOf((short) pVar.g());
        }
        if (i10 >= 32 && i10 <= 246) {
            return Integer.valueOf(i10 - 139);
        }
        if (i10 >= 247 && i10 <= 250) {
            return Integer.valueOf(((i10 - 247) * 256) + pVar.f() + HeaderItem.DATA_START_OFFSET);
        }
        if (i10 >= 251 && i10 <= 254) {
            return Integer.valueOf((((-(i10 - 251)) * 256) - pVar.f()) - 108);
        }
        if (i10 != 255) {
            throw new IllegalArgumentException();
        }
        return Double.valueOf(((short) pVar.g()) + (pVar.g() / 65535.0d));
    }

    public final List<Object> a(byte[] bArr, byte[][] bArr2, byte[][] bArr3, boolean z10) throws IOException {
        if (z10) {
            this.f23530a = 0;
            this.f23531b = 0;
            this.f23532c = new ArrayList();
        }
        p pVar = new p(bArr);
        boolean z11 = bArr3 != null && bArr3.length > 0;
        boolean z12 = bArr2 != null && bArr2.length > 0;
        while (pVar.f23511b < pVar.f23510a.length) {
            int iF = pVar.f();
            int i10 = 32768;
            if (iF == 10 && z11) {
                ArrayList arrayList = this.f23532c;
                Integer num = (Integer) arrayList.remove(arrayList.size() - 1);
                int length = bArr3.length;
                if (length < 1240) {
                    i10 = 107;
                } else if (length < 33900) {
                    i10 = 1131;
                }
                int iIntValue = num.intValue() + i10;
                if (iIntValue < bArr3.length) {
                    a(bArr3[iIntValue], bArr2, bArr3, false);
                    Object objB = l.b.b(this.f23532c, 1);
                    if ((objB instanceof o) && ((o) objB).f23508a.f23509a[0] == 11) {
                        ArrayList arrayList2 = this.f23532c;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                }
            } else if (iF == 29 && z12) {
                ArrayList arrayList3 = this.f23532c;
                Integer num2 = (Integer) arrayList3.remove(arrayList3.size() - 1);
                int length2 = bArr2.length;
                if (length2 < 1240) {
                    i10 = 107;
                } else if (length2 < 33900) {
                    i10 = 1131;
                }
                int iIntValue2 = num2.intValue() + i10;
                if (iIntValue2 < bArr2.length) {
                    a(bArr2[iIntValue2], bArr2, bArr3, false);
                    Object objB2 = l.b.b(this.f23532c, 1);
                    if ((objB2 instanceof o) && ((o) objB2).f23508a.f23509a[0] == 11) {
                        ArrayList arrayList4 = this.f23532c;
                        arrayList4.remove(arrayList4.size() - 1);
                    }
                }
            } else if (iF >= 0 && iF <= 27) {
                this.f23532c.add(c(iF, pVar));
            } else if (iF == 28) {
                this.f23532c.add(d(iF, pVar));
            } else if (iF >= 29 && iF <= 31) {
                this.f23532c.add(c(iF, pVar));
            } else {
                if (iF < 32 || iF > 255) {
                    throw new IllegalArgumentException();
                }
                this.f23532c.add(d(iF, pVar));
            }
        }
        return this.f23532c;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        int size = this.f23532c.size();
        while (true) {
            size--;
            if (size <= -1) {
                break;
            }
            Object obj = this.f23532c.get(size);
            if (!(obj instanceof Number)) {
                break;
            }
            arrayList.add(0, (Number) obj);
        }
        return arrayList;
    }

    public final o c(int i10, p pVar) throws IOException {
        if (i10 == 1 || i10 == 18) {
            this.f23530a = (b().size() / 2) + this.f23530a;
        } else if (i10 == 3 || i10 == 19 || i10 == 20 || i10 == 23) {
            this.f23531b = (b().size() / 2) + this.f23531b;
        }
        if (i10 == 12) {
            return new o(i10, pVar.f());
        }
        if (i10 != 19 && i10 != 20) {
            return new o(i10);
        }
        int i11 = this.f23530a + this.f23531b;
        int i12 = i11 / 8;
        if (i11 % 8 > 0) {
            i12++;
        }
        int i13 = i12 + 1;
        int[] iArr = new int[i13];
        iArr[0] = i10;
        for (int i14 = 1; i14 < i13; i14++) {
            iArr[i14] = pVar.f();
        }
        o oVar = new o();
        o.a aVar = new o.a();
        aVar.f23509a = iArr;
        oVar.f23508a = aVar;
        return oVar;
    }
}
