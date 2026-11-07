package y8;

import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f34240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f34241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f34243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f34244e;

    public /* synthetic */ u0(Context context, n1 n1Var, boolean z10, String str, n1 n1Var2) {
        this.f34240a = context;
        this.f34241b = n1Var;
        this.f34242c = z10;
        this.f34243d = str;
        this.f34244e = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        String message;
        this.f34241b.setValue(Boolean.FALSE);
        Object obj2 = ((pg.p) obj).f21471a;
        Throwable thA = pg.p.a(obj2);
        Context context = this.f34240a;
        if (thA == null) {
            message = (this.f34242c && ((Boolean) this.f34244e.getValue()).booleanValue()) ? context.getString(R.string.keystore_persisted) : context.getString(R.string.keystore_created_success, this.f34243d);
            kotlin.jvm.internal.r.b(message);
        } else {
            message = thA.getMessage();
            if (message == null) {
                message = context.getString(R.string.keystore_operation_failed);
                kotlin.jvm.internal.r.d(message, "getString(...)");
            }
        }
        Toast.makeText(context, message, 0).show();
        return pg.f0.f21461a;
    }
}
