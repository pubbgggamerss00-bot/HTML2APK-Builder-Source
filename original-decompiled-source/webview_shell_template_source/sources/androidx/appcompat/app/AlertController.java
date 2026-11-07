package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.core.widget.NestedScrollView;
import com.htmltoapk.template.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AlertController {

    /* renamed from: a, reason: collision with root package name */
    public final Context f92a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.b f93b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f94c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f95d;

    /* renamed from: e, reason: collision with root package name */
    public RecycleListView f96e;

    /* renamed from: f, reason: collision with root package name */
    public Button f97f;

    /* renamed from: g, reason: collision with root package name */
    public Button f98g;
    public Button h;

    /* renamed from: i, reason: collision with root package name */
    public NestedScrollView f99i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f100j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f101k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f102l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f103m;

    /* renamed from: n, reason: collision with root package name */
    public View f104n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f105o;

    /* renamed from: q, reason: collision with root package name */
    public final int f107q;

    /* renamed from: r, reason: collision with root package name */
    public final int f108r;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f109t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f110u;

    /* renamed from: v, reason: collision with root package name */
    public final c f111v;

    /* renamed from: p, reason: collision with root package name */
    public int f106p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final a f112w = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class RecycleListView extends ListView {
        public final int s;

        /* renamed from: t, reason: collision with root package name */
        public final int f113t;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12951t);
            this.f113t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AlertController alertController = AlertController.this;
            alertController.f111v.obtainMessage(1, alertController.f93b).sendToTarget();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ContextThemeWrapper f114a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f115b;

        /* renamed from: c, reason: collision with root package name */
        public Drawable f116c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f117d;

        /* renamed from: e, reason: collision with root package name */
        public View f118e;

        /* renamed from: f, reason: collision with root package name */
        public g f119f;

        /* renamed from: g, reason: collision with root package name */
        public Object f120g;
        public DialogInterface.OnClickListener h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f121i;

        /* renamed from: j, reason: collision with root package name */
        public int f122j = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f114a = contextThemeWrapper;
            this.f115b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f123a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == -3 || i6 == -2 || i6 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f123a.get(), message.what);
            } else {
                if (i6 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, androidx.appcompat.app.b bVar, Window window) {
        this.f92a = context;
        this.f93b = bVar;
        this.f94c = window;
        c cVar = new c();
        cVar.f123a = new WeakReference<>(bVar);
        this.f111v = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f12938e, R.attr.alertDialogStyle, 0);
        this.f107q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f108r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f109t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f110u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        bVar.c().n(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
