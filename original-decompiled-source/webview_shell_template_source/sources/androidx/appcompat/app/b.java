package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.g;
import androidx.core.widget.NestedScrollView;
import g.n;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends n implements DialogInterface {

    /* renamed from: x, reason: collision with root package name */
    public final AlertController f126x;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AlertController.b f127a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128b;

        public a(Context context) {
            int iE = b.e(context, 0);
            this.f127a = new AlertController.b(new ContextThemeWrapper(context, b.e(context, iE)));
            this.f128b = iE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        public final b a() {
            AlertController.b bVar = this.f127a;
            b bVar2 = new b(bVar.f114a, this.f128b);
            View view = bVar.f118e;
            AlertController alertController = bVar2.f126x;
            if (view != null) {
                alertController.f104n = view;
            } else {
                CharSequence charSequence = bVar.f117d;
                if (charSequence != null) {
                    alertController.f95d = charSequence;
                    TextView textView = alertController.f102l;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f116c;
                if (drawable != null) {
                    alertController.f100j = drawable;
                    ImageView imageView = alertController.f101k;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f101k.setImageDrawable(drawable);
                    }
                }
            }
            if (bVar.f120g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f115b.inflate(alertController.f108r, (ViewGroup) null);
                int i6 = bVar.f121i ? alertController.s : alertController.f109t;
                Object obj = bVar.f120g;
                ?? dVar = obj;
                if (obj == null) {
                    dVar = new AlertController.d(bVar.f114a, i6, R.id.text1, null);
                }
                alertController.f105o = dVar;
                alertController.f106p = bVar.f122j;
                if (bVar.h != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar, alertController));
                }
                if (bVar.f121i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f96e = recycleListView;
            }
            bVar2.setCancelable(true);
            bVar2.setCanceledOnTouchOutside(true);
            bVar2.setOnCancelListener(null);
            bVar2.setOnDismissListener(null);
            g gVar = bVar.f119f;
            if (gVar != null) {
                bVar2.setOnKeyListener(gVar);
            }
            return bVar2;
        }
    }

    public b(ContextThemeWrapper contextThemeWrapper, int i6) {
        super(contextThemeWrapper, e(contextThemeWrapper, i6));
        this.f126x = new AlertController(getContext(), this, getWindow());
    }

    public static int e(Context context, int i6) {
        if (((i6 >>> 24) & 255) >= 1) {
            return i6;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.htmltoapk.template.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // g.n, androidx.activity.r, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i6;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f126x;
        alertController.f93b.setContentView(alertController.f107q);
        Context context = alertController.f92a;
        Window window = alertController.f94c;
        View viewFindViewById2 = window.findViewById(com.htmltoapk.template.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.htmltoapk.template.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.htmltoapk.template.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.htmltoapk.template.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.htmltoapk.template.R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(com.htmltoapk.template.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.htmltoapk.template.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.htmltoapk.template.R.id.buttonPanel);
        ViewGroup viewGroupA = AlertController.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = AlertController.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = AlertController.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.htmltoapk.template.R.id.scrollView);
        alertController.f99i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f99i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(R.id.message);
        alertController.f103m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f99i.removeView(alertController.f103m);
            if (alertController.f96e != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f99i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(alertController.f99i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(alertController.f96e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(R.id.button1);
        alertController.f97f = button;
        AlertController.a aVar = alertController.f112w;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            alertController.f97f.setVisibility(8);
            i6 = 0;
        } else {
            alertController.f97f.setText((CharSequence) null);
            alertController.f97f.setVisibility(0);
            i6 = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(R.id.button2);
        alertController.f98g = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            alertController.f98g.setVisibility(8);
        } else {
            alertController.f98g.setText((CharSequence) null);
            alertController.f98g.setVisibility(0);
            i6 |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(R.id.button3);
        alertController.h = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            alertController.h.setVisibility(8);
        } else {
            alertController.h.setText((CharSequence) null);
            alertController.h.setVisibility(0);
            i6 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.htmltoapk.template.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i6 == 1) {
                Button button4 = alertController.f97f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i6 == 2) {
                Button button5 = alertController.f98g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i6 == 4) {
                Button button6 = alertController.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i6 == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (alertController.f104n != null) {
            viewGroupA.addView(alertController.f104n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.htmltoapk.template.R.id.title_template).setVisibility(8);
        } else {
            alertController.f101k = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.f95d) || !alertController.f110u) {
                window.findViewById(com.htmltoapk.template.R.id.title_template).setVisibility(8);
                alertController.f101k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.htmltoapk.template.R.id.alertTitle);
                alertController.f102l = textView2;
                textView2.setText(alertController.f95d);
                Drawable drawable = alertController.f100j;
                if (drawable != null) {
                    alertController.f101k.setImageDrawable(drawable);
                } else {
                    alertController.f102l.setPadding(alertController.f101k.getPaddingLeft(), alertController.f101k.getPaddingTop(), alertController.f101k.getPaddingRight(), alertController.f101k.getPaddingBottom());
                    alertController.f101k.setVisibility(8);
                }
            }
        }
        boolean z6 = viewGroup.getVisibility() != 8;
        int i7 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z7 = viewGroupA3.getVisibility() != 8;
        if (!z7 && (viewFindViewById = viewGroupA2.findViewById(com.htmltoapk.template.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f99i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = alertController.f96e != null ? viewGroupA.findViewById(com.htmltoapk.template.R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(com.htmltoapk.template.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f96e;
        if (recycleListView != null && (!z7 || i7 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.s, recycleListView.getPaddingRight(), z7 ? recycleListView.getPaddingBottom() : recycleListView.f113t);
        }
        if (!z6) {
            View view = alertController.f96e;
            if (view == null) {
                view = alertController.f99i;
            }
            if (view != null) {
                int i8 = z7 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(com.htmltoapk.template.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.htmltoapk.template.R.id.scrollIndicatorDown);
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                f0.e.b(view, i7 | i8, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f96e;
        if (recycleListView2 == null || (listAdapter = alertController.f105o) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i9 = alertController.f106p;
        if (i9 > -1) {
            recycleListView2.setItemChecked(i9, true);
            recycleListView2.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f126x.f99i;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyDown(i6, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i6, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f126x.f99i;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyUp(i6, keyEvent);
        }
        return true;
    }

    @Override // g.n, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f126x;
        alertController.f95d = charSequence;
        TextView textView = alertController.f102l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
