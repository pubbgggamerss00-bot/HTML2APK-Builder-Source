package d3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b3.e;
import kotlin.jvm.internal.s;
import p1.h;
import q1.d2;
import x0.g0;
import x0.x1;

/* loaded from: classes.dex */
public final class c extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f7345a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7346b;

    /* renamed from: c, reason: collision with root package name */
    public final x1 f7347c = bg.b.h(new h(9205357640488583168L));

    /* renamed from: d, reason: collision with root package name */
    public final g0 f7348d = bg.b.d(new a());

    public static final class a extends s implements eh.a<Shader> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.a
        public final Shader invoke() {
            c cVar = c.this;
            x1 x1Var = cVar.f7347c;
            if (((h) x1Var.getValue()).f21143a == 9205357640488583168L || h.e(((h) x1Var.getValue()).f21143a)) {
                return null;
            }
            return cVar.f7345a.b(((h) x1Var.getValue()).f21143a);
        }
    }

    public c(d2 d2Var, float f10) {
        this.f7345a = d2Var;
        this.f7346b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        e.e(textPaint, this.f7346b);
        textPaint.setShader((Shader) this.f7348d.getValue());
    }
}
