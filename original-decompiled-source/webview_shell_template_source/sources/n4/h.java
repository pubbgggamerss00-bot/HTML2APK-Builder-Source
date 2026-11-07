package n4;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.p;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public float f13986c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference<b> f13988e;

    /* renamed from: f, reason: collision with root package name */
    public q4.d f13989f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f13984a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final a f13985b = new a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f13987d = true;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends p {
        public a() {
        }

        @Override // androidx.fragment.app.p
        public final void e(int i6) {
            h hVar = h.this;
            hVar.f13987d = true;
            b bVar = hVar.f13988e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // androidx.fragment.app.p
        public final void f(Typeface typeface, boolean z6) {
            if (z6) {
                return;
            }
            h hVar = h.this;
            hVar.f13987d = true;
            b bVar = hVar.f13988e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(com.google.android.material.chip.a aVar) {
        this.f13988e = new WeakReference<>(null);
        this.f13988e = new WeakReference<>(aVar);
    }

    public final float a(String str) {
        if (!this.f13987d) {
            return this.f13986c;
        }
        TextPaint textPaint = this.f13984a;
        this.f13986c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f13987d = false;
        return this.f13986c;
    }
}
