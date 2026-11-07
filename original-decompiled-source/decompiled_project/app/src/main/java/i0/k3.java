package i0;

import android.view.InputDevice;
import android.view.KeyEvent;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;

/* loaded from: classes.dex */
public final class k3 extends kotlin.jvm.internal.s implements eh.l<a2.c, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.n f13387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f13388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(o1.n nVar, i2 i2Var) {
        super(1);
        this.f13387a = nVar;
        this.f13388b = i2Var;
    }

    @Override // eh.l
    public final Boolean invoke(a2.c cVar) {
        KeyEvent keyEvent = cVar.f17a;
        InputDevice device = keyEvent.getDevice();
        boolean zN = false;
        if (device != null && device.supportsSource(BinaryXmlFormat.RES_TABLE_TYPE_TYPE) && !device.isVirtual() && a2.d.b(keyEvent) == 2 && keyEvent.getSource() != 257) {
            boolean zA = h1.m.a(19, keyEvent);
            o1.n nVar = this.f13387a;
            if (zA) {
                zN = nVar.n(5);
            } else if (h1.m.a(20, keyEvent)) {
                zN = nVar.n(6);
            } else if (h1.m.a(21, keyEvent)) {
                zN = nVar.n(3);
            } else if (h1.m.a(22, keyEvent)) {
                zN = nVar.n(4);
            } else if (h1.m.a(23, keyEvent)) {
                j2.z4 z4Var = this.f13388b.f13339c;
                if (z4Var != null) {
                    z4Var.a();
                }
                zN = true;
            }
        }
        return Boolean.valueOf(zN);
    }
}
