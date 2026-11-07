package x4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<y4.a> f32070d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f32071a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.h f32072b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f32073c = 0;

    public k(androidx.emoji2.text.h hVar, int i10) {
        this.f32072b = hVar;
        this.f32071a = i10;
    }

    public final int a(int i10) {
        y4.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = aVarB.f33936b;
        int i11 = iA + aVarB.f33935a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final y4.a b() {
        ThreadLocal<y4.a> threadLocal = f32070d;
        y4.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new y4.a();
            threadLocal.set(aVar);
        }
        y4.b bVar = this.f32072b.f2242a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f33935a;
            int i11 = (this.f32071a * 4) + bVar.f33936b.getInt(i10) + i10 + 4;
            int i12 = bVar.f33936b.getInt(i11) + i11;
            ByteBuffer byteBuffer = bVar.f33936b;
            aVar.f33936b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f33935a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f33937c = i13;
                aVar.f33938d = aVar.f33936b.getShort(i13);
                return aVar;
            }
            aVar.f33935a = 0;
            aVar.f33937c = 0;
            aVar.f33938d = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        y4.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? aVarB.f33936b.getInt(iA + aVarB.f33935a) : 0));
        sb.append(", codepoints:");
        y4.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + aVarB2.f33935a;
            i10 = aVarB2.f33936b.getInt(aVarB2.f33936b.getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(Integer.toHexString(a(i12)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
