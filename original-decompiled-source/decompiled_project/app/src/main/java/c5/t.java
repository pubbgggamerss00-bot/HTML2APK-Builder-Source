package c5;

import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class t<E> extends p {

    /* renamed from: a, reason: collision with root package name */
    public final n f4979a;

    /* renamed from: b, reason: collision with root package name */
    public final n f4980b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4981c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f4982d;

    public t(n nVar) {
        Handler handler = new Handler();
        this.f4982d = new c0();
        this.f4979a = nVar;
        this.f4980b = nVar;
        this.f4981c = handler;
    }

    public abstract void b0(PrintWriter printWriter, String[] strArr);

    public abstract n c0();

    public abstract LayoutInflater d0();

    public abstract void e0();
}
