package androidx.compose.ui.input.key;

import a2.c;
import a2.f;
import androidx.compose.ui.d;
import eh.l;
import i2.a1;

/* loaded from: classes.dex */
final class KeyInputElement extends a1<f> {

    /* renamed from: b, reason: collision with root package name */
    public final l<c, Boolean> f1198b;

    /* renamed from: c, reason: collision with root package name */
    public final l<c, Boolean> f1199c;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(l<? super c, Boolean> lVar, l<? super c, Boolean> lVar2) {
        this.f1198b = lVar;
        this.f1199c = lVar2;
    }

    @Override // i2.a1
    public final d.c a() {
        f fVar = new f();
        fVar.f18q = this.f1198b;
        fVar.f19r = this.f1199c;
        return fVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        f fVar = (f) cVar;
        fVar.f18q = this.f1198b;
        fVar.f19r = this.f1199c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f1198b == keyInputElement.f1198b && this.f1199c == keyInputElement.f1199c;
    }

    public final int hashCode() {
        l<c, Boolean> lVar = this.f1198b;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l<c, Boolean> lVar2 = this.f1199c;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }
}
