package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<e1.a> f1043d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f1044a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1045b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1046c = 0;

    public q(o oVar, int i6) {
        this.f1045b = oVar;
        this.f1044a = i6;
    }

    public final int a(int i6) {
        e1.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f12778d;
        int i7 = iA + aVarB.f12775a;
        return byteBuffer.getInt((i6 * 4) + byteBuffer.getInt(i7) + i7 + 4);
    }

    public final e1.a b() {
        ThreadLocal<e1.a> threadLocal = f1043d;
        e1.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new e1.a();
            threadLocal.set(aVar);
        }
        e1.b bVar = this.f1045b.f1035a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i6 = iA + bVar.f12775a;
            int i7 = (this.f1044a * 4) + ((ByteBuffer) bVar.f12778d).getInt(i6) + i6 + 4;
            int i8 = ((ByteBuffer) bVar.f12778d).getInt(i7) + i7;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f12778d;
            aVar.f12778d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f12775a = i8;
                int i9 = i8 - byteBuffer.getInt(i8);
                aVar.f12776b = i9;
                aVar.f12777c = ((ByteBuffer) aVar.f12778d).getShort(i9);
                return aVar;
            }
            aVar.f12775a = 0;
            aVar.f12776b = 0;
            aVar.f12777c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i6;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        e1.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f12778d).getInt(iA + aVarB.f12775a) : 0));
        sb.append(", codepoints:");
        e1.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i7 = iA2 + aVarB2.f12775a;
            i6 = ((ByteBuffer) aVarB2.f12778d).getInt(((ByteBuffer) aVarB2.f12778d).getInt(i7) + i7);
        } else {
            i6 = 0;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            sb.append(Integer.toHexString(a(i8)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
