package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final e1.b f1035a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f1036b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1037c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f1038d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f1039a;

        /* renamed from: b, reason: collision with root package name */
        public q f1040b;

        public a() {
            this(1);
        }

        public final void a(q qVar, int i6, int i7) {
            int iA = qVar.a(i6);
            SparseArray<a> sparseArray = this.f1039a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(qVar.a(i6), aVar);
            }
            if (i7 > i6) {
                aVar.a(qVar, i6 + 1, i7);
            } else {
                aVar.f1040b = qVar;
            }
        }

        public a(int i6) {
            this.f1039a = new SparseArray<>(i6);
        }
    }

    public o(Typeface typeface, e1.b bVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        this.f1038d = typeface;
        this.f1035a = bVar;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f12775a;
            i6 = ((ByteBuffer) bVar.f12778d).getInt(((ByteBuffer) bVar.f12778d).getInt(i10) + i10);
        } else {
            i6 = 0;
        }
        this.f1036b = new char[i6 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i11 = iA2 + bVar.f12775a;
            i7 = ((ByteBuffer) bVar.f12778d).getInt(((ByteBuffer) bVar.f12778d).getInt(i11) + i11);
        } else {
            i7 = 0;
        }
        for (int i12 = 0; i12 < i7; i12++) {
            q qVar = new q(this, i12);
            e1.a aVarB = qVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f12778d).getInt(iA3 + aVarB.f12775a) : 0, this.f1036b, i12 * 2);
            e1.a aVarB2 = qVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i13 = iA4 + aVarB2.f12775a;
                i8 = ((ByteBuffer) aVarB2.f12778d).getInt(((ByteBuffer) aVarB2.f12778d).getInt(i13) + i13);
            } else {
                i8 = 0;
            }
            androidx.work.j.a("invalid metadata codepoint length", i8 > 0);
            a aVar = this.f1037c;
            e1.a aVarB3 = qVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i14 = iA5 + aVarB3.f12775a;
                i9 = ((ByteBuffer) aVarB3.f12778d).getInt(((ByteBuffer) aVarB3.f12778d).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            aVar.a(qVar, 0, i9 - 1);
        }
    }
}
