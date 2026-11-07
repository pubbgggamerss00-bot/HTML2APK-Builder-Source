package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class e1 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f6651a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6652b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f6653c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6654d;

    public e1(p0 p0Var, String str, Object[] objArr) {
        this.f6651a = p0Var;
        this.f6652b = str;
        this.f6653c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6654d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f6654d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final p0 getDefaultInstance() {
        return this.f6651a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final b1 getSyntax() {
        return (this.f6654d & 1) == 1 ? b1.f6632a : b1.f6633b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final boolean isMessageSetWireFormat() {
        return (this.f6654d & 2) == 2;
    }
}
