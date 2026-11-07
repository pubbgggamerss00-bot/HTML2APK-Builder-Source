package m9;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.basitce.htmltoapk.R;
import m9.s1;

/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17866b;

    public /* synthetic */ n1(Object obj, int i10) {
        this.f17865a = i10;
        this.f17866b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f17865a;
        Object obj = this.f17866b;
        switch (i10) {
            case 0:
                s1 s1Var = (s1) obj;
                s1.b bVar = s1Var.f17914s;
                if (bVar != null) {
                    bVar.a(false);
                }
                TextView textView = s1Var.f17913r;
                if (textView != null) {
                    textView.setText(R.string.pdf_document_failed_short);
                }
                s1.a aVar = s1Var.f17907k;
                float f10 = s1Var.f17905h;
                int i11 = s1Var.f17906j;
                s1Var.f17901d.setVisibility(4);
                LinearLayout linearLayout = s1Var.f17917w;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                if (s1Var.C == null) {
                    LinearLayout linearLayout2 = new LinearLayout(s1Var.getContext());
                    linearLayout2.setOrientation(1);
                    linearLayout2.setGravity(1);
                    linearLayout2.setPadding(s1Var.b(24), s1Var.b(24), s1Var.b(24), s1Var.b(24));
                    linearLayout2.setBackground(s1.d(24.0f * f10, aVar.f17924d));
                    linearLayout2.setElevation(2.0f * f10);
                    FrameLayout frameLayout = new FrameLayout(s1Var.getContext());
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(r3.a.d(i11, 36));
                    frameLayout.setBackground(gradientDrawable);
                    ImageView imageView = new ImageView(s1Var.getContext());
                    imageView.setImageResource(R.drawable.pdf_ic_error);
                    imageView.setImageTintList(ColorStateList.valueOf(i11));
                    frameLayout.addView(imageView, new FrameLayout.LayoutParams(s1Var.b(28), s1Var.b(28), 17));
                    linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(s1Var.b(56), s1Var.b(56)));
                    TextView textView2 = new TextView(s1Var.getContext());
                    textView2.setText(R.string.pdf_document_error);
                    textView2.setTextColor(aVar.f17922b);
                    textView2.setTextSize(2, 16.0f);
                    textView2.setGravity(17);
                    textView2.setPadding(0, s1Var.b(16), 0, 0);
                    linearLayout2.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
                    final eh.a<pg.f0> aVar2 = s1Var.f17902e;
                    if (aVar2 != null) {
                        Button button = new Button(s1Var.getContext(), null, android.R.attr.borderlessButtonStyle);
                        button.setText(R.string.pdf_document_close);
                        button.setAllCaps(false);
                        button.setTextColor(i11);
                        button.setBackground(new RippleDrawable(ColorStateList.valueOf(r3.a.d(i11, 61)), s1.d(20.0f * f10, r3.a.d(i11, 36)), null));
                        button.setPadding(s1Var.b(24), 0, s1Var.b(24), 0);
                        button.setOnClickListener(new View.OnClickListener() { // from class: m9.b1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                aVar2.invoke();
                            }
                        });
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, s1Var.b(40));
                        layoutParams.topMargin = s1Var.b(16);
                        pg.f0 f0Var = pg.f0.f21461a;
                        linearLayout2.addView(button, layoutParams);
                    }
                    s1Var.C = linearLayout2;
                    FrameLayout frameLayout2 = s1Var.f17912q;
                    int iB = s1Var.b(360);
                    int iB2 = s1Var.getResources().getDisplayMetrics().widthPixels - s1Var.b(48);
                    if (iB > iB2) {
                        iB = iB2;
                    }
                    frameLayout2.addView(linearLayout2, new FrameLayout.LayoutParams(iB, -2, 17));
                }
                eh.a<pg.f0> aVar3 = s1Var.f17904g;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                break;
            default:
                ((eh.l) obj).invoke("ai");
                break;
        }
        return pg.f0.f21461a;
    }
}
