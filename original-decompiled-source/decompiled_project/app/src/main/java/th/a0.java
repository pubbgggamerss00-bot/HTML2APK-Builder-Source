package th;

import sh.o0;
import sh.y0;

/* loaded from: classes2.dex */
public final class a0 extends o0<Integer> implements y0<Integer> {
    @Override // sh.y0
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f25044h;
            kotlin.jvm.internal.r.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f25045j + ((int) ((p() + this.f25047l) - this.f25045j))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void x(int i10) {
        synchronized (this) {
            Object[] objArr = this.f25044h;
            kotlin.jvm.internal.r.b(objArr);
            r(Integer.valueOf(((Number) objArr[((int) ((this.f25045j + ((int) ((p() + this.f25047l) - this.f25045j))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
