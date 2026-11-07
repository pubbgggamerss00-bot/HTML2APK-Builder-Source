package w2;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.htmltoapk.template.R;
import w2.l0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f14904t;

    public /* synthetic */ h0(FrameLayout frameLayout, int i6) {
        this.s = i6;
        this.f14904t = frameLayout;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                ((l0) this.f14904t).j();
                break;
            case 1:
                l0 l0Var = (l0) this.f14904t;
                l0.b bVar = l0Var.I;
                if (bVar != null) {
                    bVar.a(false);
                }
                TextView textView = l0Var.H;
                if (textView != null) {
                    textView.setText(R.string.pdf_document_failed_short);
                }
                l0.a aVar = l0Var.B;
                float f6 = l0Var.f14925z;
                int i6 = l0Var.A;
                l0Var.f14921v.setVisibility(4);
                LinearLayout linearLayout = l0Var.L;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                if (l0Var.R == null) {
                    LinearLayout linearLayout2 = new LinearLayout(l0Var.getContext());
                    linearLayout2.setOrientation(1);
                    linearLayout2.setGravity(1);
                    linearLayout2.setPadding(l0Var.b(24), l0Var.b(24), l0Var.b(24), l0Var.b(24));
                    linearLayout2.setBackground(l0.f(24.0f * f6, aVar.f14929d));
                    linearLayout2.setElevation(2.0f * f6);
                    FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(m0.a.e(i6, 36));
                    frameLayout.setBackground(gradientDrawable);
                    ImageView imageView = new ImageView(l0Var.getContext());
                    imageView.setImageResource(R.drawable.pdf_ic_error);
                    imageView.setImageTintList(ColorStateList.valueOf(i6));
                    frameLayout.addView(imageView, new FrameLayout.LayoutParams(l0Var.b(28), l0Var.b(28), 17));
                    linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(l0Var.b(56), l0Var.b(56)));
                    TextView textView2 = new TextView(l0Var.getContext());
                    textView2.setText(R.string.pdf_document_error);
                    textView2.setTextColor(aVar.f14927b);
                    textView2.setTextSize(2, 16.0f);
                    textView2.setGravity(17);
                    textView2.setPadding(0, l0Var.b(16), 0, 0);
                    linearLayout2.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
                    p5.a<d5.j> aVar2 = l0Var.f14922w;
                    if (aVar2 != null) {
                        Button button = new Button(l0Var.getContext(), null, android.R.attr.borderlessButtonStyle);
                        button.setText(R.string.pdf_document_close);
                        button.setAllCaps(false);
                        button.setTextColor(i6);
                        button.setBackground(new RippleDrawable(ColorStateList.valueOf(m0.a.e(i6, 61)), l0.f(20.0f * f6, m0.a.e(i6, 36)), null));
                        button.setPadding(l0Var.b(24), 0, l0Var.b(24), 0);
                        button.setOnClickListener(new com.google.android.material.datepicker.s(1, aVar2));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, l0Var.b(40));
                        layoutParams.topMargin = l0Var.b(16);
                        linearLayout2.addView(button, layoutParams);
                    }
                    l0Var.R = linearLayout2;
                    FrameLayout frameLayout2 = l0Var.G;
                    int iB = l0Var.b(360);
                    int iB2 = l0Var.getResources().getDisplayMetrics().widthPixels - l0Var.b(48);
                    if (iB > iB2) {
                        iB = iB2;
                    }
                    frameLayout2.addView(linearLayout2, new FrameLayout.LayoutParams(iB, -2, 17));
                }
                p5.a<d5.j> aVar3 = l0Var.f14924y;
                if (aVar3 != null) {
                    aVar3.a();
                }
                return d5.j.f12745a;
            default:
                ((t) this.f14904t).q();
                break;
        }
        return d5.j.f12745a;
    }
}
