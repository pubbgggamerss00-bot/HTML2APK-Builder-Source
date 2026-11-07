package l;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ TextView s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Typeface f13580t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13581u;

    public b0(TextView textView, Typeface typeface, int i6) {
        this.s = textView;
        this.f13580t = typeface;
        this.f13581u = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.s.setTypeface(this.f13580t, this.f13581u);
    }
}
