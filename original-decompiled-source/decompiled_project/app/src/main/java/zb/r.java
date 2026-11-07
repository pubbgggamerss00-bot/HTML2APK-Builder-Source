package zb;

import android.util.StateSet;

/* loaded from: classes2.dex */
public final class r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final int f34990a;

    /* renamed from: b, reason: collision with root package name */
    public final m f34991b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f34992c;

    /* renamed from: d, reason: collision with root package name */
    public final m[] f34993d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f34994a;

        /* renamed from: b, reason: collision with root package name */
        public m f34995b;

        /* renamed from: c, reason: collision with root package name */
        public int[][] f34996c;

        /* renamed from: d, reason: collision with root package name */
        public m[] f34997d;
    }

    public r(a aVar) {
        this.f34990a = aVar.f34994a;
        this.f34991b = aVar.f34995b;
        this.f34992c = aVar.f34996c;
        this.f34993d = aVar.f34997d;
    }

    @Override // zb.l
    public final m a(int[] iArr) {
        int i10;
        int i11;
        int[][] iArr2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = -1;
            i11 = this.f34990a;
            iArr2 = this.f34992c;
            if (i13 >= i11) {
                i13 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i13], iArr)) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i12], iArr3)) {
                    i10 = i12;
                    break;
                }
                i12++;
            }
            i13 = i10;
        }
        return this.f34993d[i13];
    }
}
