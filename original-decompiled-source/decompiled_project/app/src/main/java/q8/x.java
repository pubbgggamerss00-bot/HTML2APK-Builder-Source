package q8;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.TabStopSpan;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.OverScroller;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import l9.n;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.EACTags;
import q8.l;
import q8.x;
import q8.z0;

/* loaded from: classes.dex */
public final class x extends View {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public y2.c0 F;
    public String G;
    public final SpannableStringBuilder H;
    public final ExecutorService I;
    public Future<?> K;
    public ExecutorService L;
    public final AtomicInteger M;
    public boolean N;
    public l O;
    public boolean P;
    public long Q;
    public int R;
    public boolean S;
    public int T;
    public int U;
    public final OverScroller V;
    public ActionMode W;

    /* renamed from: a, reason: collision with root package name */
    public eh.l<? super y2.c0, pg.f0> f22443a;

    /* renamed from: a0, reason: collision with root package name */
    public int f22444a0;

    /* renamed from: b, reason: collision with root package name */
    public int f22445b;

    /* renamed from: b0, reason: collision with root package name */
    public float f22446b0;

    /* renamed from: c, reason: collision with root package name */
    public int f22447c;

    /* renamed from: c0, reason: collision with root package name */
    public float f22448c0;

    /* renamed from: d, reason: collision with root package name */
    public int f22449d;

    /* renamed from: d0, reason: collision with root package name */
    public float f22450d0;

    /* renamed from: e, reason: collision with root package name */
    public int f22451e;

    /* renamed from: e0, reason: collision with root package name */
    public int f22452e0;

    /* renamed from: f, reason: collision with root package name */
    public eh.a<pg.f0> f22453f;

    /* renamed from: f0, reason: collision with root package name */
    public int f22454f0;

    /* renamed from: g, reason: collision with root package name */
    public eh.a<pg.f0> f22455g;

    /* renamed from: g0, reason: collision with root package name */
    public int f22456g0;

    /* renamed from: h, reason: collision with root package name */
    public eh.a<pg.f0> f22457h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f22458h0;

    /* renamed from: i0, reason: collision with root package name */
    public final qg.l<y2.c0> f22459i0;

    /* renamed from: j, reason: collision with root package name */
    public eh.q<? super Integer, ? super Integer, ? super Integer, pg.f0> f22460j;

    /* renamed from: j0, reason: collision with root package name */
    public final qg.l<y2.c0> f22461j0;

    /* renamed from: k, reason: collision with root package name */
    public int f22462k;

    /* renamed from: k0, reason: collision with root package name */
    public int f22463k0;

    /* renamed from: l, reason: collision with root package name */
    public int f22464l;

    /* renamed from: l0, reason: collision with root package name */
    public final g f22465l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22466m;

    /* renamed from: m0, reason: collision with root package name */
    public final GestureDetector f22467m0;

    /* renamed from: n, reason: collision with root package name */
    public int[] f22468n;

    /* renamed from: n0, reason: collision with root package name */
    public final b f22469n0;

    /* renamed from: o0, reason: collision with root package name */
    public final c f22470o0;

    /* renamed from: p, reason: collision with root package name */
    public z0.a f22471p;

    /* renamed from: q, reason: collision with root package name */
    public float f22472q;

    /* renamed from: r, reason: collision with root package name */
    public int f22473r;

    /* renamed from: s, reason: collision with root package name */
    public int f22474s;

    /* renamed from: t, reason: collision with root package name */
    public int f22475t;

    /* renamed from: v, reason: collision with root package name */
    public final TextPaint f22476v;

    /* renamed from: w, reason: collision with root package name */
    public final Paint f22477w;

    /* renamed from: x, reason: collision with root package name */
    public final float f22478x;

    /* renamed from: y, reason: collision with root package name */
    public float f22479y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22480z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f22481a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22482b;

        /* renamed from: c, reason: collision with root package name */
        public final StaticLayout f22483c;

        /* renamed from: d, reason: collision with root package name */
        public final float f22484d;

        public a(int i10, int i11, StaticLayout staticLayout, float f10) {
            this.f22481a = i10;
            this.f22482b = i11;
            this.f22483c = staticLayout;
            this.f22484d = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22481a == aVar.f22481a && this.f22482b == aVar.f22482b && kotlin.jvm.internal.r.a(this.f22483c, aVar.f22483c) && Float.compare(this.f22484d, aVar.f22484d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f22484d) + ((this.f22483c.hashCode() + androidx.datastore.preferences.protobuf.a1.a(this.f22482b, Integer.hashCode(this.f22481a) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = p.g0.a(this.f22481a, this.f22482b, "Run(start=", ", end=", ", layout=");
            sbA.append(this.f22483c);
            sbA.append(", x=");
            sbA.append(this.f22484d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            float f10;
            x xVar = x.this;
            float f11 = xVar.f22478x;
            if (xVar.f22444a0 == 0 || xVar.N) {
                return;
            }
            float f12 = xVar.f22448c0;
            float f13 = 3;
            float lineHeight = f12 < f11 * f13 ? -xVar.getLineHeight() : f12 > ((float) xVar.getHeight()) - (f11 * f13) ? xVar.getLineHeight() : 0.0f;
            if (xVar.f22480z) {
                f10 = 0.0f;
            } else {
                float f14 = xVar.f22446b0;
                if (f14 < (f11 * f13) + xVar.f22479y) {
                    f10 = (-f11) * f13;
                } else {
                    f10 = f11 * f13;
                    if (f14 <= xVar.getWidth() - f10) {
                    }
                }
            }
            if (f10 == CropImageView.DEFAULT_ASPECT_RATIO && lineHeight == CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            xVar.scrollTo(xVar.getViewportX() + ((int) f10), xVar.getViewportY() + ((int) lineHeight));
            xVar.f();
            xVar.postDelayed(this, 16L);
        }
    }

    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x xVar = x.this;
            if (!xVar.N && xVar.hasFocus() && xVar.getWindowVisibility() == 0) {
                xVar.f22458h0 = !xVar.f22458h0;
                xVar.invalidate();
                xVar.postDelayed(this, 500L);
            }
        }
    }

    public static final class d extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f22488b;

        public d(Context context) {
            this.f22488b = context;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent e10) {
            kotlin.jvm.internal.r.e(e10, "e");
            x.this.V.forceFinished(true);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent second, float f10, float f11) {
            int width;
            kotlin.jvm.internal.r.e(second, "second");
            x xVar = x.this;
            OverScroller overScroller = xVar.V;
            int viewportX = xVar.getViewportX();
            int viewportY = xVar.getViewportY();
            int i10 = (int) (-f10);
            int i11 = (int) (-f11);
            if (xVar.f22480z) {
                width = 0;
            } else {
                int iComputeHorizontalScrollRange = xVar.computeHorizontalScrollRange();
                int width2 = xVar.getWidth();
                if (iComputeHorizontalScrollRange < width2) {
                    iComputeHorizontalScrollRange = width2;
                }
                width = iComputeHorizontalScrollRange - xVar.getWidth();
            }
            int i12 = width;
            int iComputeVerticalScrollRange = xVar.computeVerticalScrollRange();
            int height = xVar.getHeight();
            if (iComputeVerticalScrollRange < height) {
                iComputeVerticalScrollRange = height;
            }
            overScroller.fling(viewportX, viewportY, i10, i11, 0, i12, 0, iComputeVerticalScrollRange - xVar.getHeight());
            xVar.postInvalidateOnAnimation();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent e10) {
            kotlin.jvm.internal.r.e(e10, "e");
            x xVar = x.this;
            if (xVar.N) {
                return;
            }
            xVar.requestFocus();
            String str = xVar.G;
            int iM = jh.j.m(xVar.l(e10.getX(), e10.getY()), 0, str.length());
            int i10 = iM;
            while (i10 > 0 && iM - i10 < 256 && x.b(xVar, str.charAt(i10 - 1))) {
                i10--;
            }
            int i11 = iM;
            while (i11 < str.length() && i11 - iM < 256 && x.b(xVar, str.charAt(i11))) {
                i11++;
            }
            x.x(xVar, i10, i11, 4);
            xVar.f22452e0 = i10;
            xVar.f22444a0 = 2;
            xVar.f22446b0 = e10.getX();
            xVar.f22448c0 = e10.getY();
            xVar.f22450d0 = CropImageView.DEFAULT_ASPECT_RATIO;
            ActionMode actionMode = xVar.W;
            if (actionMode != null) {
                actionMode.invalidate();
            } else {
                xVar.W = xVar.startActionMode(new y(xVar), 1);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent second, float f10, float f11) {
            kotlin.jvm.internal.r.e(second, "second");
            x xVar = x.this;
            ViewParent parent = xVar.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            xVar.scrollTo(xVar.getViewportX() + ((int) f10), xVar.getViewportY() + ((int) f11));
            xVar.invalidate();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent e10) {
            kotlin.jvm.internal.r.e(e10, "e");
            x xVar = x.this;
            xVar.requestFocus();
            ActionMode actionMode = xVar.W;
            if (actionMode != null) {
                actionMode.finish();
            }
            x.x(xVar, xVar.l(e10.getX(), e10.getY()), 0, 6);
            xVar.performClick();
            Object systemService = this.f22488b.getSystemService("input_method");
            kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(xVar, 1);
            return true;
        }
    }

    public static final class e extends BaseInputConnection {
        public e() {
            super(x.this, true);
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean beginBatchEdit() {
            x xVar = x.this;
            int i10 = xVar.D;
            xVar.D = i10 + 1;
            if (i10 != 0) {
                return true;
            }
            xVar.s();
            return true;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean commitText(CharSequence charSequence, int i10) {
            x xVar = x.this;
            if (charSequence != null && charSequence.length() == 1 && i10 == 1 && BaseInputConnection.getComposingSpanStart(xVar.H) < 0 && xVar.z(charSequence.toString())) {
                return true;
            }
            boolean zCommitText = super.commitText(charSequence, i10);
            xVar.p();
            return zCommitText;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean deleteSurroundingText(int i10, int i11) {
            if (i10 == 1 && i11 == 0 && x.this.y()) {
                return true;
            }
            return super.deleteSurroundingText(i10, i11);
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean endBatchEdit() {
            x.this.g();
            return true;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean finishComposingText() {
            boolean zFinishComposingText = super.finishComposingText();
            x.this.p();
            return zFinishComposingText;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public final Editable getEditable() {
            return x.this.H;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
            x xVar = x.this;
            int iMin = Math.min(xVar.getSelectionStart(), xVar.getSelectionEnd()) - 1024;
            if (iMin < 0) {
                iMin = 0;
            }
            int i11 = iMin + 2048;
            int length = xVar.H.length();
            if (i11 > length) {
                i11 = length;
            }
            ExtractedText extractedText = new ExtractedText();
            String strSubstring = xVar.G.substring(iMin, i11);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            extractedText.text = strSubstring;
            extractedText.startOffset = iMin;
            extractedText.partialStartOffset = -1;
            extractedText.partialEndOffset = -1;
            int i12 = i11 - iMin;
            extractedText.selectionStart = jh.j.m(xVar.getSelectionStart() - iMin, 0, i12);
            extractedText.selectionEnd = jh.j.m(xVar.getSelectionEnd() - iMin, 0, i12);
            return extractedText;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final CharSequence getSelectedText(int i10) {
            x xVar = x.this;
            String strSubstring = xVar.G.substring(Math.min(xVar.getSelectionStart(), xVar.getSelectionEnd()), Math.min(Math.max(xVar.getSelectionStart(), xVar.getSelectionEnd()), Math.min(xVar.getSelectionStart(), xVar.getSelectionEnd()) + 2048));
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            return strSubstring;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final CharSequence getTextAfterCursor(int i10, int i11) {
            CharSequence textAfterCursor = super.getTextAfterCursor(jh.j.m(i10, 0, 2048), i11);
            return textAfterCursor == null ? "" : textAfterCursor;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final CharSequence getTextBeforeCursor(int i10, int i11) {
            CharSequence textBeforeCursor = super.getTextBeforeCursor(jh.j.m(i10, 0, 2048), i11);
            return textBeforeCursor == null ? "" : textBeforeCursor;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean performContextMenuAction(int i10) {
            return x.this.m(i10);
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean sendKeyEvent(KeyEvent event) {
            kotlin.jvm.internal.r.e(event, "event");
            if (event.getAction() == 0) {
                return x.this.i(event);
            }
            return true;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean setComposingRegion(int i10, int i11) {
            boolean composingRegion = super.setComposingRegion(i10, i11);
            x.this.p();
            return composingRegion;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean setComposingText(CharSequence charSequence, int i10) {
            boolean composingText = super.setComposingText(charSequence, i10);
            x.this.p();
            return composingText;
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public final boolean setSelection(int i10, int i11) {
            x.x(x.this, i10, i11, 4);
            return true;
        }
    }

    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return i0.x1.b(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t3).lastModified()));
        }
    }

    public static final class h implements TextWatcher, SpanWatcher {
        public h() {
        }

        public final void a(Object obj) {
            if (obj == Selection.SELECTION_END) {
                x xVar = x.this;
                if (xVar.B || xVar.C || xVar.D != 0) {
                    return;
                }
                xVar.p();
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            x xVar = x.this;
            xVar.C = false;
            if (xVar.B) {
                return;
            }
            xVar.G = xVar.H.toString();
            if (xVar.D != 0) {
                xVar.E = true;
                return;
            }
            xVar.S = true;
            xVar.q();
            xVar.p();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            x xVar = x.this;
            xVar.C = true;
            if (xVar.B || xVar.D != 0) {
                return;
            }
            xVar.s();
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            a(obj);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            a(obj);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            a(obj);
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        super(context);
        kotlin.jvm.internal.r.e(context, "context");
        this.f22443a = new q(0);
        this.f22449d = 1077891509;
        this.f22451e = -12627531;
        this.f22472q = 13.0f;
        this.f22473r = -1;
        this.f22474s = -1;
        this.f22475t = -1;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 13.0f);
        this.f22476v = textPaint;
        this.f22477w = new Paint(1);
        this.f22478x = getResources().getDisplayMetrics().density * 8.0f;
        this.f22480z = true;
        this.F = new y2.c0("", 0L, 6);
        this.G = "";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.H = spannableStringBuilder;
        this.I = Executors.newSingleThreadExecutor();
        this.M = new AtomicInteger();
        this.V = new OverScroller(context);
        this.f22458h0 = true;
        this.f22459i0 = new qg.l<>();
        this.f22461j0 = new qg.l<>();
        this.f22465l0 = new g(64, 0.75f, true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setSaveEnabled(false);
        setSaveFromParentEnabled(false);
        setImportantForAutofill(8);
        setVerticalScrollBarEnabled(true);
        setHorizontalScrollBarEnabled(true);
        setWillNotDraw(false);
        Selection.setSelection(spannableStringBuilder, 0);
        spannableStringBuilder.setSpan(new h(), 0, 0, 18);
        this.f22467m0 = new GestureDetector(context, new d(context));
        this.f22469n0 = new b();
        this.f22470o0 = new c();
    }

    public static final boolean b(x xVar, char c10) {
        return Character.isLetterOrDigit(c10) || c10 == '_' || Character.isHighSurrogate(c10) || Character.isLowSurrogate(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLineHeight() {
        float fontSpacing = this.f22476v.getFontSpacing() * 1.25f;
        if (fontSpacing < 1.0f) {
            return 1.0f;
        }
        return fontSpacing;
    }

    public static final boolean n(MotionEvent motionEvent, x xVar, pg.n<Float, Float> nVar) {
        float fAbs = Math.abs(motionEvent.getX() - nVar.f21469a.floatValue());
        float f10 = xVar.f22478x;
        float f11 = 3;
        return fAbs < f10 * f11 && Math.abs((motionEvent.getY() - nVar.f21470b.floatValue()) - xVar.getLineHeight()) < f10 * f11;
    }

    public static String o(int i10, String str) {
        int i11;
        if (i10 > 0) {
            int i12 = i10 - 1;
            if (str.charAt(i12) != '/') {
                while (i12 >= 0 && i10 - i12 < 1024) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt == '>') {
                        break;
                    }
                    if (cCharAt == '<') {
                        break;
                    }
                    i12--;
                }
                if (i12 >= 0) {
                    Character chValueOf = (i12 < 0 || i12 >= str.length()) ? null : Character.valueOf(str.charAt(i12));
                    if (chValueOf != null && chValueOf.charValue() == '<' && (i11 = i12 + 1) < str.length() && Character.isLetter(str.charAt(i11))) {
                        int i13 = i11;
                        while (i13 < i10 && (Character.isLetterOrDigit(str.charAt(i13)) || str.charAt(i13) == '-' || str.charAt(i13) == ':')) {
                            i13++;
                        }
                        String strSubstring = str.substring(i11, i13);
                        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                        Set<String> set = z0.f22504a;
                        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
                        if (!set.contains(lowerCase)) {
                            return strSubstring;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void x(x xVar, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = i10;
        }
        xVar.w(i10, i11, true);
    }

    public final Integer A(int i10) {
        int i11;
        z0.a aVar = this.f22471p;
        if (aVar == null) {
            return null;
        }
        int[] iArr = aVar.f22507b;
        String str = this.G;
        if (aVar.f22506a == str) {
            i11 = i10 / 256;
        } else {
            int i12 = i10 - 512;
            if (i12 < 0) {
                i12 = 0;
            }
            i11 = i12 / 256;
        }
        int iG = iArr[jh.j.m(i11, 0, iArr.length - 1)];
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        for (int iM = jh.j.m(i11, 0, iArr.length - 1) * 256; iM < i10; iM++) {
            iG = (int) (z0.g(str, iM, iG) >>> 8);
        }
        return Integer.valueOf(iG);
    }

    public final y2.c0 B() {
        String str = this.G;
        long jA = t2.k0.a(getSelectionStart(), getSelectionEnd());
        SpannableStringBuilder spannableStringBuilder = this.H;
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(spannableStringBuilder);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(spannableStringBuilder);
        return new y2.c0(str, jA, (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) ? null : new t2.j0(t2.k0.a(composingSpanStart, composingSpanEnd)));
    }

    public final a C(int i10, int i11) {
        l lVar = this.O;
        kotlin.jvm.internal.r.b(lVar);
        String str = lVar.f22283a;
        int i12 = lVar.f22284b[i10];
        int[] iArr = lVar.f22285c;
        int iM = (((jh.j.m(i11, i12, iArr[i10]) - i12) / 512) * 512) + i12;
        if (iM > i12 && iM < str.length() && Character.isLowSurrogate(str.charAt(iM))) {
            iM--;
        }
        int i13 = iM + 512;
        int i14 = iArr[i10];
        if (i13 > i14) {
            i13 = i14;
        }
        if (i13 < str.length() && i13 > iM && Character.isLowSurrogate(str.charAt(i13))) {
            i13--;
        }
        return v(i10, iM, i13);
    }

    public final void c(y2.c0 value, boolean z10) {
        kotlin.jvm.internal.r.e(value, "value");
        long j10 = value.f33683b;
        String str = this.G;
        t2.b bVar = value.f33682a;
        boolean zA = kotlin.jvm.internal.r.a(str, bVar.f27761b);
        if (!zA || (z10 && !t2.j0.a(j10, this.F.f33683b))) {
            this.B = true;
            SpannableStringBuilder spannableStringBuilder = this.H;
            if (!zA) {
                try {
                    this.G = bVar.f27761b;
                    spannableStringBuilder.replace(0, spannableStringBuilder.length(), (CharSequence) this.G);
                    this.f22459i0.clear();
                    this.f22461j0.clear();
                    this.f22463k0 = 0;
                } catch (Throwable th2) {
                    this.B = false;
                    throw th2;
                }
            }
            if (!z10) {
                j10 = t2.j0.f27837b;
            }
            int i10 = t2.j0.f27838c;
            Selection.setSelection(spannableStringBuilder, jh.j.m((int) (j10 >> 32), 0, spannableStringBuilder.length()), jh.j.m((int) (j10 & BodyPartID.bodyIdMax), 0, spannableStringBuilder.length()));
            BaseInputConnection.removeComposingSpans(spannableStringBuilder);
            this.F = new y2.c0(this.G, t2.k0.a(getSelectionStart(), getSelectionEnd()), 4);
            this.B = false;
            if (zA) {
                h();
            } else {
                this.S = z10;
                if (!z10) {
                    scrollTo(0, 0);
                }
                q();
            }
            k();
            invalidate();
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return this.T;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return (int) Math.ceil((this.f22478x * 2) + (this.O != null ? r0.f22288f : CropImageView.DEFAULT_ASPECT_RATIO) + this.f22479y);
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.V;
        if (overScroller.computeScrollOffset()) {
            scrollTo(overScroller.getCurrX(), overScroller.getCurrY());
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.U;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return (int) Math.ceil((this.f22478x * 2) + ((this.O != null ? r0.f22284b.length : 1) * getLineHeight()));
    }

    public final pg.n<Float, Float> d(int i10) {
        l lVar = this.O;
        float f10 = this.f22478x;
        if (lVar == null) {
            return new pg.n<>(Float.valueOf(this.f22479y + f10), Float.valueOf(f10));
        }
        int iB = lVar.b(i10);
        a aVarC = C(iB, i10);
        int i11 = aVarC.f22481a;
        return new pg.n<>(Float.valueOf((aVarC.f22483c.getPrimaryHorizontal(jh.j.m(i10 - i11, 0, aVarC.f22482b - i11)) + ((this.f22479y + f10) + aVarC.f22484d)) - this.T), Float.valueOf(((iB * getLineHeight()) + f10) - this.U));
    }

    public final void e() {
        Toast.makeText(getContext(), R.string.editor_clipboard_error, 0).show();
    }

    public final void f() {
        int iL = l(this.f22446b0, this.f22448c0 - this.f22450d0);
        if (this.f22444a0 == 1) {
            w(iL, this.f22452e0, false);
        } else {
            w(this.f22452e0, iL, false);
        }
    }

    public final void g() {
        int i10 = this.D - 1;
        if (i10 < 0) {
            i10 = 0;
        }
        this.D = i10;
        if (i10 > 0) {
            return;
        }
        if (!this.E) {
            p();
            return;
        }
        this.E = false;
        this.S = true;
        q();
        p();
    }

    public final int getCaretColor() {
        return this.f22451e;
    }

    public final int getCurrentLineColor() {
        return this.f22462k;
    }

    public final int getCurrentNumberColor() {
        return this.f22464l;
    }

    public final l getDocumentLayout() {
        return this.O;
    }

    public final String getDocumentText() {
        return this.G;
    }

    public final int getGutterColor() {
        return this.f22445b;
    }

    public final long getLastLayoutDurationMs() {
        return this.Q;
    }

    public final boolean getLayoutBuildInProgress() {
        return this.P;
    }

    public final int getMaxDrawnChunkLength() {
        return this.R;
    }

    public final int getNumberColor() {
        return this.f22447c;
    }

    public final eh.q<Integer, Integer, Integer, pg.f0> getOnCaretInfo() {
        return this.f22460j;
    }

    public final eh.a<pg.f0> getOnRedoRequest() {
        return this.f22455g;
    }

    public final eh.a<pg.f0> getOnSaveRequest() {
        return this.f22457h;
    }

    public final eh.a<pg.f0> getOnUndoRequest() {
        return this.f22453f;
    }

    public final eh.l<y2.c0, pg.f0> getOnValue() {
        return this.f22443a;
    }

    public final int getSelectionColor() {
        return this.f22449d;
    }

    public final int getSelectionEnd() {
        int selectionEnd = Selection.getSelectionEnd(this.H);
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd;
    }

    public final int getSelectionStart() {
        int selectionStart = Selection.getSelectionStart(this.H);
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart;
    }

    public final boolean getSmartTyping() {
        return this.f22466m;
    }

    public final int[] getSyntaxColors() {
        return this.f22468n;
    }

    public final Editable getText() {
        return this.H;
    }

    public final int getViewportX() {
        return this.T;
    }

    public final int getViewportY() {
        return this.U;
    }

    public final void h() {
        int i10;
        int i11;
        float lineHeight;
        l lVar = this.O;
        if (lVar != null && kotlin.jvm.internal.r.a(lVar.f22283a, this.G)) {
            int width = 0;
            this.S = false;
            pg.n<Float, Float> nVarD = d(getSelectionEnd());
            float fFloatValue = nVarD.f21469a.floatValue();
            float fFloatValue2 = nVarD.f21470b.floatValue();
            boolean z10 = this.f22480z;
            float f10 = this.f22478x;
            if (!z10) {
                float f11 = this.f22479y;
                width = fFloatValue < f11 + f10 ? ((int) ((fFloatValue - f11) - f10)) + this.T : fFloatValue > ((float) getWidth()) - f10 ? this.T + ((int) ((fFloatValue - getWidth()) + f10)) : this.T;
            }
            if (fFloatValue2 < f10) {
                i11 = this.U;
                lineHeight = fFloatValue2 - f10;
            } else {
                if (getLineHeight() + fFloatValue2 <= getHeight() - f10) {
                    i10 = this.U;
                    scrollTo(width, i10);
                    invalidate();
                }
                i11 = this.U;
                lineHeight = ((fFloatValue2 + getLineHeight()) - getHeight()) + f10;
            }
            i10 = i11 + ((int) lineHeight);
            scrollTo(width, i10);
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(KeyEvent keyEvent) {
        boolean zIsCtrlPressed = keyEvent.isCtrlPressed();
        SpannableStringBuilder spannableStringBuilder = this.H;
        if (!zIsCtrlPressed || keyEvent.isAltPressed()) {
            int selectionEnd = getSelectionEnd();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                t("  ");
                return true;
            }
            if (keyCode == 112) {
                if (getSelectionStart() != getSelectionEnd()) {
                    t("");
                    return true;
                }
                if (keyEvent.getKeyCode() != 67 || !y()) {
                    if (keyEvent.getKeyCode() == 67 && selectionEnd > 0) {
                        x(this, Character.offsetByCodePoints(this.G, selectionEnd, -1), selectionEnd, 4);
                        t("");
                        return true;
                    }
                    if (keyEvent.getKeyCode() == 112 && selectionEnd < spannableStringBuilder.length()) {
                        x(this, selectionEnd, Character.offsetByCodePoints(this.G, selectionEnd, 1), 4);
                        t("");
                    }
                }
            } else if (keyCode != 66) {
                if (keyCode != 67) {
                    if (keyCode != 122 && keyCode != 123) {
                        switch (keyCode) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                int unicodeChar = keyEvent.getUnicodeChar();
                                if (unicodeChar != 0) {
                                    if ((Integer.MIN_VALUE & unicodeChar) == 0) {
                                        int i10 = this.f22456g0;
                                        if (i10 != 0) {
                                            int deadChar = KeyCharacterMap.getDeadChar(i10, unicodeChar);
                                            if (deadChar != 0) {
                                                unicodeChar = deadChar;
                                            } else {
                                                char[] chars = Character.toChars(this.f22456g0);
                                                kotlin.jvm.internal.r.d(chars, "toChars(...)");
                                                t(new String(chars));
                                            }
                                            this.f22456g0 = 0;
                                        }
                                        char[] chars2 = Character.toChars(unicodeChar);
                                        kotlin.jvm.internal.r.d(chars2, "toChars(...)");
                                        String str = new String(chars2);
                                        if (!z(str)) {
                                            t(str);
                                            break;
                                        }
                                    } else {
                                        this.f22456g0 = unicodeChar & Integer.MAX_VALUE;
                                        break;
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                    l lVar = this.O;
                    if (lVar != null) {
                        int[] iArr = lVar.f22284b;
                        if (kotlin.jvm.internal.r.a(lVar.f22283a, this.G)) {
                            if (!keyEvent.isShiftPressed() && getSelectionStart() != getSelectionEnd() && qg.p.j(21, 22).contains(Integer.valueOf(keyEvent.getKeyCode()))) {
                                x(this, keyEvent.getKeyCode() == 21 ? Math.min(getSelectionStart(), getSelectionEnd()) : Math.max(getSelectionStart(), getSelectionEnd()), 0, 6);
                                return true;
                            }
                            int iB = lVar.b(selectionEnd);
                            int keyCode2 = keyEvent.getKeyCode();
                            if (keyCode2 != 122) {
                                switch (keyCode2) {
                                    case 19:
                                        int i11 = iB - 1;
                                        iA = lVar.a(lVar.c(iB, selectionEnd), i11 >= 0 ? i11 : 0);
                                        break;
                                    case 20:
                                        int i12 = iB + 1;
                                        int length = iArr.length - 1;
                                        if (i12 > length) {
                                            i12 = length;
                                        }
                                        iA = lVar.a(lVar.c(iB, selectionEnd), i12);
                                        break;
                                    case 21:
                                        if (selectionEnd > 0) {
                                            iA = Character.offsetByCodePoints(this.G, selectionEnd, -1);
                                            break;
                                        }
                                        break;
                                    case 22:
                                        if (selectionEnd >= spannableStringBuilder.length()) {
                                            iA = spannableStringBuilder.length();
                                            break;
                                        } else {
                                            iA = Character.offsetByCodePoints(this.G, selectionEnd, 1);
                                            break;
                                        }
                                    default:
                                        iA = lVar.f22285c[iB];
                                        break;
                                }
                            } else {
                                iA = iArr[iB];
                            }
                            x(this, keyEvent.isShiftPressed() ? getSelectionStart() : iA, iA, 4);
                            return true;
                        }
                    }
                }
            } else if (!z("\n")) {
                t("\n");
                return true;
            }
            return true;
        }
        int keyCode3 = keyEvent.getKeyCode();
        if (keyCode3 == 29) {
            return m(android.R.id.selectAll);
        }
        if (keyCode3 == 31) {
            return m(android.R.id.copy);
        }
        if (keyCode3 != 47) {
            if (keyCode3 == 50) {
                return m(android.R.id.paste);
            }
            if (keyCode3 == 122) {
                x(this, keyEvent.isShiftPressed() ? getSelectionStart() : 0, 0, 4);
                return true;
            }
            if (keyCode3 == 123) {
                x(this, keyEvent.isShiftPressed() ? getSelectionStart() : spannableStringBuilder.length(), spannableStringBuilder.length(), 4);
                return true;
            }
            switch (keyCode3) {
                case 52:
                    return m(android.R.id.cut);
                case EACTags.SEX /* 53 */:
                    r();
                    return true;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (keyEvent.isShiftPressed()) {
                        r();
                        return true;
                    }
                    eh.a<pg.f0> aVar = this.f22453f;
                    if (aVar != null) {
                        aVar.invoke();
                        return true;
                    }
                    qg.l<y2.c0> lVar2 = this.f22459i0;
                    if (!lVar2.isEmpty()) {
                        y2.c0 c0VarRemoveLast = lVar2.removeLast();
                        this.f22463k0 -= c0VarRemoveLast.f33682a.f27761b.length();
                        qg.l lVar3 = new qg.l(lVar2);
                        int i13 = this.f22463k0;
                        y2.c0 c0VarB = B();
                        qg.l<y2.c0> lVar4 = this.f22461j0;
                        qg.l lVar5 = new qg.l(lVar4);
                        c(c0VarRemoveLast, true);
                        lVar2.addAll(lVar3);
                        this.f22463k0 = i13;
                        lVar4.addAll(lVar5);
                        lVar4.addLast(c0VarB);
                        p();
                        this.f22443a.invoke(B());
                        return true;
                    }
                    return true;
                default:
                    return false;
            }
        }
        eh.a<pg.f0> aVar2 = this.f22457h;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        if (this.f22457h != null) {
            return true;
        }
    }

    public final void j(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = this.H;
        int iMin = Math.min(getSelectionStart(), getSelectionEnd());
        int iMax = Math.max(getSelectionStart(), getSelectionEnd());
        int i11 = this.D;
        this.D = i11 + 1;
        if (i11 == 0) {
            s();
        }
        try {
            BaseInputConnection.removeComposingSpans(spannableStringBuilder);
            spannableStringBuilder.replace(iMin, iMax, (CharSequence) str);
            Selection.setSelection(spannableStringBuilder, jh.j.m(i10, 0, spannableStringBuilder.length()));
        } finally {
            g();
        }
    }

    public final void k() {
        if (hasFocus()) {
            Object systemService = getContext().getSystemService("input_method");
            kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            SpannableStringBuilder spannableStringBuilder = this.H;
            inputMethodManager.updateSelection(this, selectionStart, selectionEnd, BaseInputConnection.getComposingSpanStart(spannableStringBuilder), BaseInputConnection.getComposingSpanEnd(spannableStringBuilder));
        }
    }

    public final int l(float f10, float f11) {
        l lVar = this.O;
        if (lVar == null) {
            return 0;
        }
        int[] iArr = lVar.f22284b;
        if (iArr.length <= 0) {
            return 0;
        }
        float f12 = this.f22478x;
        int iM = jh.j.m((int) (((f11 + this.U) - f12) / getLineHeight()), 0, iArr.length - 1);
        float f13 = ((f10 + this.T) - this.f22479y) - f12;
        a aVarC = C(iM, lVar.a(f13, iM));
        return jh.j.m(jh.j.m(aVarC.f22483c.getOffsetForHorizontal(0, f13 - aVarC.f22484d) + aVarC.f22481a, iArr[iM], lVar.f22285c[iM]), 0, this.G.length());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(final int i10) {
        Object systemService = getContext().getSystemService("clipboard");
        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        final ClipboardManager clipboardManager = (ClipboardManager) systemService;
        int iMin = Math.min(getSelectionStart(), getSelectionEnd());
        int iMax = Math.max(getSelectionStart(), getSelectionEnd());
        if (i10 != 16908337) {
            switch (i10) {
                case android.R.id.selectAll:
                    x(this, 0, this.H.length(), 4);
                    return true;
                case android.R.id.cut:
                case android.R.id.copy:
                    final String strSubstring = this.G.substring(iMin, iMax);
                    kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                    if (strSubstring.length() > 128000) {
                        final y2.c0 c0VarB = B();
                        ExecutorService executorServiceNewSingleThreadExecutor = this.L;
                        if (executorServiceNewSingleThreadExecutor == null) {
                            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                            this.L = executorServiceNewSingleThreadExecutor;
                            kotlin.jvm.internal.r.d(executorServiceNewSingleThreadExecutor, "also(...)");
                        }
                        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: q8.m
                            @Override // java.lang.Runnable
                            public final void run() throws IOException {
                                final x xVar = this.f22298a;
                                String str = strSubstring;
                                final ClipboardManager clipboardManager2 = clipboardManager;
                                final int i11 = i10;
                                final y2.c0 c0Var = c0VarB;
                                try {
                                    File file = new File(xVar.getContext().getFilesDir(), "clipboard_payloads");
                                    file.mkdirs();
                                    File fileCreateTempFile = File.createTempFile("code_", ".txt", file);
                                    kotlin.jvm.internal.r.b(fileCreateTempFile);
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileCreateTempFile), mh.a.f18238b), 8192);
                                    try {
                                        bufferedWriter.write(str);
                                        pg.f0 f0Var = pg.f0.f21461a;
                                        bufferedWriter.close();
                                        final Uri uriForFile = FileProvider.getUriForFile(xVar.getContext(), xVar.getContext().getPackageName() + ".fileprovider", fileCreateTempFile);
                                        File[] fileArrListFiles = file.listFiles();
                                        if (fileArrListFiles != null) {
                                            Iterator it = qg.x.y(4, qg.o.z(new x.f(), fileArrListFiles)).iterator();
                                            while (it.hasNext()) {
                                                ((File) it.next()).delete();
                                            }
                                        }
                                        xVar.post(new Runnable() { // from class: q8.w
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ClipboardManager clipboardManager3 = clipboardManager2;
                                                Uri uri = uriForFile;
                                                y2.c0 c0Var2 = c0Var;
                                                x xVar2 = xVar;
                                                if (xVar2.N) {
                                                    return;
                                                }
                                                try {
                                                    clipboardManager3.setPrimaryClip(ClipData.newUri(xVar2.getContext().getContentResolver(), "", uri));
                                                    if (i11 == 16908320 && xVar2.B().equals(c0Var2)) {
                                                        xVar2.t("");
                                                    }
                                                } catch (RuntimeException unused) {
                                                    xVar2.e();
                                                }
                                            }
                                        });
                                    } finally {
                                    }
                                } catch (Exception unused) {
                                    xVar.post(new Runnable() { // from class: q8.n
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            x xVar2 = xVar;
                                            if (xVar2.N) {
                                                return;
                                            }
                                            xVar2.e();
                                        }
                                    });
                                }
                            }
                        });
                        return true;
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("", strSubstring));
                        if (i10 != 16908320) {
                            break;
                        } else {
                            t("");
                            return true;
                        }
                    } catch (RuntimeException unused) {
                        e();
                        return true;
                    }
                case android.R.id.paste:
                    try {
                        ClipData primaryClip = clipboardManager.getPrimaryClip();
                        if (primaryClip != null && primaryClip.getItemCount() > 0) {
                            final ClipData.Item itemAt = primaryClip.getItemAt(0);
                            if (itemAt.getText() == null) {
                                final y2.c0 c0VarB2 = B();
                                ExecutorService executorServiceNewSingleThreadExecutor2 = this.L;
                                if (executorServiceNewSingleThreadExecutor2 == null) {
                                    executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                                    this.L = executorServiceNewSingleThreadExecutor2;
                                    kotlin.jvm.internal.r.d(executorServiceNewSingleThreadExecutor2, "also(...)");
                                }
                                executorServiceNewSingleThreadExecutor2.execute(new Runnable() { // from class: q8.o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final x xVar = this.f22331a;
                                        Context context = xVar.getContext();
                                        kotlin.jvm.internal.r.d(context, "getContext(...)");
                                        l9.n nVarA = l9.p.a(context, itemAt);
                                        if (nVarA instanceof n.c) {
                                            final n.c cVar = (n.c) nVarA;
                                            final y2.c0 c0Var = c0VarB2;
                                            xVar.post(new Runnable() { // from class: q8.r
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    x xVar2 = xVar;
                                                    if (xVar2.N || !xVar2.B().equals(c0Var)) {
                                                        return;
                                                    }
                                                    xVar2.t(cVar.f16856a);
                                                }
                                            });
                                        } else {
                                            if (kotlin.jvm.internal.r.a(nVarA, n.a.f16854a)) {
                                                return;
                                            }
                                            if (kotlin.jvm.internal.r.a(nVarA, n.d.f16857a)) {
                                                xVar.post(new Runnable() { // from class: q8.s
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        x xVar2 = xVar;
                                                        if (xVar2.N) {
                                                            return;
                                                        }
                                                        Toast.makeText(xVar2.getContext(), R.string.editor_clipboard_too_large, 1).show();
                                                    }
                                                });
                                            } else {
                                                if (!kotlin.jvm.internal.r.a(nVarA, n.b.f16855a)) {
                                                    throw new pg.l();
                                                }
                                                xVar.post(new t(xVar, 0));
                                            }
                                        }
                                    }
                                });
                                break;
                            } else {
                                t(itemAt.getText().toString());
                                return true;
                            }
                        }
                    } catch (RuntimeException unused2) {
                        e();
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo info) {
        kotlin.jvm.internal.r.e(info, "info");
        info.inputType = 655361;
        info.imeOptions = 301989888;
        info.initialSelStart = getSelectionStart();
        info.initialSelEnd = getSelectionEnd();
        return new e();
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0236 A[ADDED_TO_REGION, EDGE_INSN: B:142:0x0236->B:88:0x0236 BREAK  A[LOOP:2: B:36:0x0103->B:87:0x022a], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11;
        TextPaint textPaint;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        float f11;
        float f12;
        int i16;
        int i17;
        int i18;
        int i19;
        Canvas canvas2 = canvas;
        kotlin.jvm.internal.r.e(canvas2, "canvas");
        super.onDraw(canvas);
        l lVar = this.O;
        if (lVar == null) {
            return;
        }
        int[] iArr3 = lVar.f22284b;
        String str = lVar.f22283a;
        int[] iArr4 = lVar.f22285c;
        int[] iArr5 = lVar.f22286d;
        this.R = 0;
        float f13 = this.U;
        float f14 = this.f22478x;
        int iM = jh.j.m((int) ((f13 - f14) / getLineHeight()), 0, iArr3.length - 1);
        int iM2 = jh.j.m((int) ((getHeight() + this.U) / getLineHeight()), iM, iArr3.length - 1);
        int iMin = Math.min(getSelectionStart(), getSelectionEnd());
        int iMax = Math.max(getSelectionStart(), getSelectionEnd());
        String str2 = this.G;
        boolean z10 = str == str2 || kotlin.jvm.internal.r.a(str, str2);
        int i20 = (z10 && iMin == iMax && hasFocus()) ? iArr5[lVar.b(getSelectionEnd())] : -1;
        canvas2.save();
        canvas2.clipRect(this.f22479y, CropImageView.DEFAULT_ASPECT_RATIO, getWidth(), getHeight());
        Paint paint = this.f22477w;
        if (i20 < 0 || (i19 = this.f22462k) == 0) {
            iArr = iArr4;
            iArr2 = iArr5;
            i10 = iMax;
            i11 = i20;
        } else {
            paint.setColor(i19);
            if (iM <= iM2) {
                int i21 = iM;
                while (true) {
                    if (iArr5[i21] == i20) {
                        float lineHeight = ((i21 * getLineHeight()) + f14) - this.U;
                        iArr = iArr4;
                        i10 = iMax;
                        iArr2 = iArr5;
                        i11 = i20;
                        canvas2 = canvas;
                        canvas2.drawRect(this.f22479y, lineHeight, getWidth(), lineHeight + getLineHeight(), paint);
                    } else {
                        iArr = iArr4;
                        iArr2 = iArr5;
                        i10 = iMax;
                        i11 = i20;
                    }
                    if (i21 == iM2) {
                        break;
                    }
                    i21++;
                    iMax = i10;
                    i20 = i11;
                    iArr5 = iArr2;
                    iArr4 = iArr;
                }
            }
        }
        TextPaint textPaint2 = this.f22476v;
        if (iM <= iM2) {
            int i22 = iM;
            while (true) {
                float lineHeight2 = ((i22 * getLineHeight()) + f14) - this.U;
                a aVarC = C(i22, lVar.a(this.T, i22));
                while (true) {
                    float f15 = aVarC.f22484d;
                    int i23 = aVarC.f22481a;
                    textPaint = textPaint2;
                    StaticLayout staticLayout = aVarC.f22483c;
                    int i24 = aVarC.f22482b;
                    int i25 = i22;
                    float f16 = ((this.f22479y + f14) + f15) - this.T;
                    i12 = i11;
                    float f17 = 2;
                    float lineHeight3 = ((getLineHeight() - staticLayout.getHeight()) / f17) + lineHeight2;
                    canvas2.save();
                    canvas2.translate(f16, lineHeight3);
                    if (!z10 || i10 <= iMin || i10 <= i23 || iMin >= i24) {
                        f11 = f16;
                        f12 = f17;
                        i13 = iM;
                    } else {
                        Path path = new Path();
                        int i26 = iMin - i23;
                        f11 = f16;
                        int i27 = i26 < 0 ? 0 : i26;
                        f12 = f17;
                        int i28 = i10 - i23;
                        i13 = iM;
                        int i29 = i24 - i23;
                        if (i28 > i29) {
                            i28 = i29;
                        }
                        staticLayout.getSelectionPath(i27, i28, path);
                        paint.setColor(this.f22449d);
                        canvas2.drawPath(path, paint);
                    }
                    staticLayout.draw(canvas2);
                    t2.j0 j0Var = this.F.f33684c;
                    f10 = f14;
                    if (j0Var != null) {
                        long j10 = j0Var.f27839a;
                        Paint paint2 = paint;
                        if (!z10 || ((int) (j10 & BodyPartID.bodyIdMax)) <= i23 || ((int) (j10 >> 32)) >= i24) {
                            j0Var = null;
                        }
                        if (j0Var == null) {
                            paint = paint2;
                            i16 = i24;
                            i17 = i25;
                            this.R = Math.max(this.R, i16 - i23);
                            canvas.restore();
                            if (i16 < iArr[i17]) {
                                break;
                            }
                            break;
                            break;
                        }
                        long j11 = j0Var.f27839a;
                        int i30 = ((int) (j11 >> 32)) - i23;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        float primaryHorizontal = staticLayout.getPrimaryHorizontal(i30);
                        int i31 = ((int) (j11 & BodyPartID.bodyIdMax)) - i23;
                        int i32 = i24 - i23;
                        if (i31 > i32) {
                            i31 = i32;
                        }
                        float primaryHorizontal2 = staticLayout.getPrimaryHorizontal(i31);
                        paint2.setColor(this.f22451e);
                        paint2.setStrokeWidth(getResources().getDisplayMetrics().density);
                        float lineBaseline = (getResources().getDisplayMetrics().density * f12) + staticLayout.getLineBaseline(0);
                        i16 = i24;
                        paint = paint2;
                        i17 = i25;
                        canvas2.drawLine(primaryHorizontal, lineBaseline, primaryHorizontal2, lineBaseline, paint);
                        this.R = Math.max(this.R, i16 - i23);
                        canvas.restore();
                        if (i16 < iArr[i17] || (lVar.c(i17, i16) + f11) - f15 >= getWidth() - f10) {
                            break;
                        }
                        int i33 = i16 + 512;
                        int i34 = iArr[i17];
                        if (i33 > i34) {
                            i33 = i34;
                        }
                        if (i33 < str.length() && Character.isLowSurrogate(str.charAt(i33))) {
                            i33--;
                        }
                        aVarC = v(i17, i16, i33);
                        if (aVarC.f22482b <= aVarC.f22481a) {
                            break;
                        }
                        canvas2 = canvas;
                        i22 = i17;
                        textPaint2 = textPaint;
                        iM = i13;
                        f14 = f10;
                        i11 = i12;
                    } else {
                        i16 = i24;
                        i17 = i25;
                        this.R = Math.max(this.R, i16 - i23);
                        canvas.restore();
                        if (i16 < iArr[i17]) {
                        }
                    }
                }
                if (z10 && i10 > iMin && iArr[i17] < str.length() && iMin <= (i18 = iArr[i17]) && i10 > i18) {
                    paint.setColor(this.f22449d);
                    float fC = (lVar.c(i17, iArr[i17]) + (this.f22479y + f10)) - this.T;
                    canvas.drawRect(fC, lineHeight2, (textPaint.getTextSize() / f12) + fC, lineHeight2 + getLineHeight(), paint);
                }
                if (i17 == iM2) {
                    break;
                }
                i22 = i17 + 1;
                canvas2 = canvas;
                f14 = f10;
                textPaint2 = textPaint;
                i11 = i12;
                iM = i13;
            }
        } else {
            textPaint = textPaint2;
            i12 = i11;
            f10 = f14;
            i13 = iM;
        }
        if (z10 && (hasFocus() || iMin != i10)) {
            paint.setColor(this.f22451e);
            Iterator it = (iMin == i10 ? c0.g0.c(Integer.valueOf(getSelectionEnd())) : qg.p.j(Integer.valueOf(getSelectionStart()), Integer.valueOf(getSelectionEnd()))).iterator();
            while (it.hasNext()) {
                pg.n<Float, Float> nVarD = d(((Number) it.next()).intValue());
                float fFloatValue = nVarD.f21469a.floatValue();
                float fFloatValue2 = nVarD.f21470b.floatValue();
                if (iMin == i10 && this.f22458h0) {
                    canvas.drawRect(fFloatValue, fFloatValue2, (getResources().getDisplayMetrics().density * 2) + fFloatValue, fFloatValue2 + getLineHeight(), paint);
                } else if (iMin != i10) {
                    canvas.drawCircle(fFloatValue, fFloatValue2 + getLineHeight(), f10, paint);
                }
            }
        }
        canvas.restore();
        if (!this.A) {
            return;
        }
        paint.setColor(this.f22445b);
        canvas.drawRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, this.f22479y, getHeight(), paint);
        paint.setTextSize(textPaint.getTextSize());
        paint.setTypeface(Typeface.MONOSPACE);
        paint.setTextAlign(Paint.Align.RIGHT);
        int i35 = i13;
        if (i35 > iM2) {
            return;
        }
        int i36 = i35;
        while (true) {
            if (i36 == 0 || iArr2[i36] != iArr2[i36 - 1]) {
                i14 = i12;
                if (iArr2[i36] != i14 || (i15 = this.f22464l) == 0) {
                    i15 = this.f22447c;
                }
                paint.setColor(i15);
                canvas.drawText(String.valueOf(iArr2[i36]), this.f22479y - f10, (((i36 * getLineHeight()) + f10) - this.U) - textPaint.getFontMetrics().top, paint);
            } else {
                i14 = i12;
            }
            if (i36 == iM2) {
                return;
            }
            i36++;
            i12 = i14;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f22458h0 = true;
        c cVar = this.f22470o0;
        removeCallbacks(cVar);
        if (z10 && !this.N) {
            postDelayed(cVar, 500L);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        kotlin.jvm.internal.r.e(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName("android.widget.EditText");
        info.setEditable(true);
        int iMin = Math.min(getSelectionStart(), getSelectionEnd()) - 1024;
        if (iMin < 0) {
            iMin = 0;
        }
        this.f22454f0 = iMin;
        String str = this.G;
        int i10 = iMin + 4096;
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(iMin, i10);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        info.setText(strSubstring);
        info.setTextSelection(jh.j.m(getSelectionStart() - this.f22454f0, 0, info.getText().length()), jh.j.m(getSelectionEnd() - this.f22454f0, 0, info.getText().length()));
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_TEXT);
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_SELECTION);
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_COPY);
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CUT);
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_PASTE);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent event) {
        kotlin.jvm.internal.r.e(event, "event");
        return i(event) || super.onKeyDown(i10, event);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            q();
        } else {
            h();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        ViewParent parent;
        ViewParent parent2;
        kotlin.jvm.internal.r.e(event, "event");
        if (!this.N) {
            if (event.getActionMasked() == 0 && (parent2 = getParent()) != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            if (event.getActionMasked() == 0 && getSelectionStart() != getSelectionEnd()) {
                int i10 = n(event, this, d(getSelectionStart())) ? 1 : n(event, this, d(getSelectionEnd())) ? 2 : 0;
                this.f22444a0 = i10;
                this.f22450d0 = i10 != 0 ? getLineHeight() : CropImageView.DEFAULT_ASPECT_RATIO;
                this.f22452e0 = this.f22444a0 == 1 ? getSelectionEnd() : getSelectionStart();
                if (this.f22444a0 != 0) {
                    this.V.forceFinished(true);
                    return true;
                }
            }
            if (this.f22444a0 == 0 || event.getActionMasked() == 0) {
                boolean zOnTouchEvent = this.f22467m0.onTouchEvent(event);
                if ((event.getActionMasked() == 1 || event.getActionMasked() == 3) && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                if (zOnTouchEvent || super.onTouchEvent(event)) {
                }
            } else {
                this.f22446b0 = event.getX();
                this.f22448c0 = event.getY();
                int actionMasked = event.getActionMasked();
                b bVar = this.f22469n0;
                if (actionMasked == 2) {
                    ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                    f();
                    removeCallbacks(bVar);
                    postDelayed(bVar, 16L);
                    return true;
                }
                if (event.getActionMasked() == 1 || event.getActionMasked() == 3) {
                    this.f22444a0 = 0;
                    removeCallbacks(bVar);
                    ActionMode actionMode = this.W;
                    if (actionMode != null) {
                        actionMode.invalidate();
                    } else {
                        this.W = startActionMode(new y(this), 1);
                    }
                    ViewParent parent4 = getParent();
                    if (parent4 != null) {
                        parent4.requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        c cVar = this.f22470o0;
        removeCallbacks(cVar);
        if (i10 == 0 && hasFocus() && !this.N) {
            postDelayed(cVar, 500L);
        }
    }

    public final void p() {
        this.f22458h0 = true;
        if (this.B || this.C || this.D > 0) {
            return;
        }
        y2.c0 c0VarB = B();
        if (!c0VarB.equals(this.F)) {
            this.F = c0VarB;
            this.f22443a.invoke(c0VarB);
        }
        u();
        k();
        ActionMode actionMode = this.W;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        CharSequence charSequence;
        if (i10 == 4096) {
            scrollTo(this.T, getHeight() + this.U);
            return true;
        }
        if (i10 == 8192) {
            scrollTo(this.T, this.U - getHeight());
            return true;
        }
        if (i10 == 16384) {
            return m(android.R.id.copy);
        }
        if (i10 == 32768) {
            return m(android.R.id.paste);
        }
        if (i10 == 65536) {
            return m(android.R.id.cut);
        }
        if (i10 == 131072) {
            x(this, this.f22454f0 + (bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT") : 0), this.f22454f0 + (bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT") : 0), 4);
            return true;
        }
        if (i10 != 2097152) {
            return super.performAccessibilityAction(i10, bundle);
        }
        x(this, 0, this.H.length(), 4);
        if (bundle == null || (charSequence = bundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) == null) {
            charSequence = "";
        }
        t(charSequence);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void q() {
        float width;
        if (this.N) {
            return;
        }
        final int iIncrementAndGet = this.M.incrementAndGet();
        Future<?> future = this.K;
        if (future != null) {
            future.cancel(true);
        }
        final String str = this.G;
        boolean z10 = this.A;
        final TextPaint textPaint = new TextPaint(this.f22476v);
        int length = str.length();
        if (length < 1) {
            length = 1;
        }
        int length2 = String.valueOf(length).length();
        float f10 = this.f22478x;
        this.f22479y = z10 ? (2 * f10) + textPaint.measureText(mh.t.l(length2, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0)) : CropImageView.DEFAULT_ASPECT_RATIO;
        if (this.f22480z) {
            float f11 = 2;
            width = (getWidth() - this.f22479y) - (f10 * f11);
            float textSize = textPaint.getTextSize() * f11;
            if (width < textSize) {
                width = textSize;
            }
        } else {
            width = Float.POSITIVE_INFINITY;
        }
        final float f12 = width;
        this.P = true;
        final l lVar = this.O;
        int[] iArr = this.f22468n;
        final z0.a aVar = iArr != null ? this.f22471p : null;
        final boolean z11 = iArr != null;
        this.K = this.I.submit(new Runnable() { // from class: q8.p
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
            
                r1 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
            
                if (r1 >= (r8 - r9)) goto L150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
            
                r29 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
            
                if (r10.charAt(mh.x.u(r10) - r1) != r13.charAt(mh.x.u(r13) - r1)) goto L151;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
            
                if ((r1 % 4096) != 0) goto L153;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
            
                if (((java.lang.Boolean) r27.invoke()).booleanValue() == false) goto L154;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
            
                r1 = r1 + 1;
                r3 = r29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
            
                r29 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
            
                r2 = 256;
             */
            /* JADX WARN: Removed duplicated region for block: B:100:0x02b4  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x034e A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                eh.a aVar2;
                x xVar;
                int i10;
                int i11;
                int i12;
                int i13;
                long j10;
                int i14;
                final l lVar2;
                int i15;
                long j11;
                TextPaint textPaint2;
                int i16;
                int i17;
                kotlin.jvm.internal.c0 c0Var;
                double d10;
                kotlin.jvm.internal.c0 c0Var2;
                long j12;
                float f13;
                int i18;
                int iM;
                long jUptimeMillis = SystemClock.uptimeMillis();
                final x xVar2 = this;
                final int i19 = iIncrementAndGet;
                eh.a aVar3 = new eh.a() { // from class: q8.u
                    @Override // eh.a
                    public final Object invoke() {
                        x xVar3 = xVar2;
                        return Boolean.valueOf(xVar3.N || xVar3.M.get() != i19 || Thread.currentThread().isInterrupted());
                    }
                };
                TextPaint textPaint3 = textPaint;
                float fMeasureText = textPaint3.measureText(" ") * 4;
                String text = str;
                kotlin.jvm.internal.r.e(text, "text");
                double[] dArr = new double[text.length() + 1];
                c1 c1Var = new c1();
                c1 c1Var2 = new c1();
                c1 c1Var3 = new c1();
                float[] fArr = new float[256];
                l lVar3 = lVar;
                z0.a aVar4 = null;
                if (lVar3 != null) {
                    String str2 = lVar3.f22283a;
                    int iMin = Math.min(text.length(), str2.length());
                    i13 = 0;
                    while (true) {
                        aVar2 = aVar3;
                        if (i13 >= iMin) {
                            xVar = xVar2;
                            break;
                        }
                        xVar = xVar2;
                        if (text.charAt(i13) != str2.charAt(i13)) {
                            break;
                        }
                        if (i13 % 4096 == 0 && ((Boolean) aVar2.invoke()).booleanValue()) {
                            i10 = i19;
                            break;
                        } else {
                            i13++;
                            aVar3 = aVar2;
                            xVar2 = xVar;
                        }
                    }
                    j10 = jUptimeMillis;
                    lVar2 = null;
                    i14 = 0;
                    if (lVar2 != null) {
                        return;
                    }
                    if (z11) {
                        Set<String> set = z0.f22504a;
                        int[] iArr2 = new int[(text.length() / 256) + 1];
                        z0.a aVar5 = aVar;
                        if (aVar5 != null) {
                            int[] iArr3 = aVar5.f22507b;
                            String str3 = aVar5.f22506a;
                            if (str3 == text) {
                                aVar4 = aVar5;
                            } else {
                                int iMin2 = Math.min(text.length(), str3.length());
                                int i20 = i14;
                                while (i20 < iMin2 && text.charAt(i20) == str3.charAt(i20)) {
                                    if (i20 % 8192 == 0 && ((Boolean) aVar2.invoke()).booleanValue()) {
                                        break;
                                    } else {
                                        i20++;
                                    }
                                }
                                i18 = 256;
                                iM = jh.j.m((i20 - 64) / 256, i14, Math.min(iArr3.length, r2) - 1);
                                qg.m.d(i14, iArr3, i14, iM + 1, iArr2);
                            }
                            if (aVar4 == null) {
                                return;
                            }
                        } else {
                            i18 = 256;
                            iM = i14;
                        }
                        int iG = iArr2[iM];
                        int i21 = iM * i18;
                        while (true) {
                            if (i21 >= text.length()) {
                                aVar4 = new z0.a(text, iArr2);
                                break;
                            } else {
                                if (i21 % 4096 == 0 && ((Boolean) aVar2.invoke()).booleanValue()) {
                                    break;
                                }
                                if (i21 % 256 == 0) {
                                    iArr2[i21 / 256] = iG;
                                }
                                iG = (int) (z0.g(text, i21, iG) >>> 8);
                                i21++;
                            }
                        }
                        if (aVar4 == null) {
                        }
                    }
                    final z0.a aVar6 = aVar4;
                    final x xVar3 = xVar;
                    final int i22 = i10;
                    final long j13 = j10;
                    xVar3.post(new Runnable() { // from class: q8.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            x xVar4 = xVar3;
                            if (xVar4.N || xVar4.M.get() != i22) {
                                return;
                            }
                            xVar4.O = lVar2;
                            xVar4.f22471p = aVar6;
                            xVar4.Q = SystemClock.uptimeMillis() - j13;
                            xVar4.P = false;
                            xVar4.f22465l0.clear();
                            xVar4.scrollTo(xVar4.T, xVar4.U);
                            if (xVar4.S) {
                                xVar4.h();
                            }
                            xVar4.u();
                            xVar4.invalidate();
                        }
                    });
                    return;
                }
                aVar2 = aVar3;
                xVar = xVar2;
                i10 = i19;
                i11 = 256;
                i12 = 0;
                i13 = 0;
                int i23 = i13 - i11;
                if (i23 < 0) {
                    i23 = 0;
                }
                int length3 = (text.length() - i12) + i11;
                int length4 = text.length();
                if (length3 > length4) {
                    length3 = length4;
                }
                kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
                kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
                e0Var2.f16324a = 1;
                kotlin.jvm.internal.c0 c0Var3 = new kotlin.jvm.internal.c0();
                kotlin.jvm.internal.c0 c0Var4 = new kotlin.jvm.internal.c0();
                kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0();
                int i24 = 0;
                while (i24 < text.length()) {
                    if (((Boolean) aVar2.invoke()).booleanValue()) {
                        j10 = jUptimeMillis;
                        lVar2 = null;
                        i14 = 0;
                    } else {
                        int i25 = i24 + 256;
                        kotlin.jvm.internal.e0 e0Var3 = e0Var2;
                        int length5 = text.length();
                        if (i25 > length5) {
                            i25 = length5;
                        }
                        if (i25 < text.length() && Character.isLowSurrogate(text.charAt(i25))) {
                            i25--;
                        }
                        if (lVar3 == null || (i25 > i23 && i24 < length3)) {
                            i15 = length3;
                            j11 = jUptimeMillis;
                            textPaint3.getTextWidths(text, i24, i25, fArr);
                            pg.f0 f0Var = pg.f0.f21461a;
                        } else {
                            int length6 = text.length() - lVar3.f22283a.length();
                            int i26 = i24;
                            while (i26 < i25) {
                                int i27 = i26 < i23 ? i26 : i26 - length6;
                                int i28 = i26 - i24;
                                int i29 = length3;
                                int i30 = i26;
                                if (text.charAt(i26) == '\n') {
                                    j12 = jUptimeMillis;
                                    f13 = 0.0f;
                                } else {
                                    double[] dArr2 = lVar3.f22287e;
                                    j12 = jUptimeMillis;
                                    f13 = (float) (dArr2[i27 + 1] - dArr2[i27]);
                                }
                                fArr[i28] = f13;
                                i26 = i30 + 1;
                                length3 = i29;
                                jUptimeMillis = j12;
                            }
                            i15 = length3;
                            j11 = jUptimeMillis;
                        }
                        int i31 = i24;
                        while (i31 < i25) {
                            char cCharAt = text.charAt(i31);
                            double d11 = c0Var3.f16320a;
                            dArr[i31] = d11;
                            int i32 = i31;
                            if (cCharAt == '\n') {
                                kotlin.jvm.internal.c0 c0Var5 = c0Var3;
                                l.a.a(c1Var, e0Var, c1Var2, c1Var3, e0Var3, d0Var, c0Var5, c0Var4, i32);
                                c0Var2 = c0Var4;
                                textPaint2 = textPaint3;
                                e0Var.f16324a = i32 + 1;
                                e0Var3.f16324a++;
                                i16 = i24;
                                c0Var5.f16320a = 0.0d;
                                c0Var2.f16320a = 0.0d;
                                i17 = i23;
                                c0Var = c0Var5;
                            } else {
                                textPaint2 = textPaint3;
                                i16 = i24;
                                i17 = i23;
                                kotlin.jvm.internal.c0 c0Var6 = c0Var4;
                                c0Var = c0Var3;
                                kotlin.jvm.internal.e0 e0Var4 = e0Var;
                                if (cCharAt == '\t') {
                                    double d12 = fMeasureText;
                                    d10 = d12 - (d11 % d12);
                                } else {
                                    float f14 = fArr[i32 - i16];
                                    if (f14 < CropImageView.DEFAULT_ASPECT_RATIO) {
                                        f14 = 0.0f;
                                    }
                                    d10 = f14;
                                }
                                float f15 = f12;
                                if (Math.abs(f15) > Float.MAX_VALUE || i32 <= e0Var4.f16324a) {
                                    i32 = i32;
                                    e0Var = e0Var4;
                                } else {
                                    i32 = i32;
                                    if ((c0Var.f16320a + d10) - c0Var6.f16320a <= f15 || Character.isLowSurrogate(cCharAt) || qg.p.j(6, 8).contains(Integer.valueOf(Character.getType(cCharAt)))) {
                                        e0Var = e0Var4;
                                    } else {
                                        e0Var = e0Var4;
                                        l.a.a(c1Var, e0Var, c1Var2, c1Var3, e0Var3, d0Var, c0Var, c0Var6, i32);
                                        c0Var2 = c0Var6;
                                        e0Var.f16324a = i32;
                                        c0Var2.f16320a = c0Var.f16320a;
                                        c0Var.f16320a += d10;
                                    }
                                }
                                c0Var2 = c0Var6;
                                c0Var.f16320a += d10;
                            }
                            i31 = i32 + 1;
                            c0Var4 = c0Var2;
                            c0Var3 = c0Var;
                            textPaint3 = textPaint2;
                            i24 = i16;
                            i23 = i17;
                        }
                        i24 = i25;
                        e0Var2 = e0Var3;
                        length3 = i15;
                        jUptimeMillis = j11;
                    }
                }
                kotlin.jvm.internal.c0 c0Var7 = c0Var3;
                j10 = jUptimeMillis;
                dArr[text.length()] = c0Var7.f16320a;
                l.a.a(c1Var, e0Var, c1Var2, c1Var3, e0Var2, d0Var, c0Var7, c0Var4, text.length());
                int[] iArrCopyOf = Arrays.copyOf(c1Var.f22151a, c1Var.f22152b);
                kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
                int[] iArrCopyOf2 = Arrays.copyOf(c1Var2.f22151a, c1Var2.f22152b);
                kotlin.jvm.internal.r.d(iArrCopyOf2, "copyOf(...)");
                int[] iArrCopyOf3 = Arrays.copyOf(c1Var3.f22151a, c1Var3.f22152b);
                kotlin.jvm.internal.r.d(iArrCopyOf3, "copyOf(...)");
                i14 = 0;
                lVar2 = new l(text, iArrCopyOf, iArrCopyOf2, iArrCopyOf3, dArr, d0Var.f16322a);
                if (lVar2 != null) {
                }
            }
        });
        invalidate();
    }

    public final void r() {
        eh.a<pg.f0> aVar = this.f22455g;
        if (aVar != null) {
            aVar.invoke();
            return;
        }
        qg.l<y2.c0> lVar = this.f22461j0;
        if (lVar.isEmpty()) {
            return;
        }
        y2.c0 c0VarRemoveLast = lVar.removeLast();
        qg.l lVar2 = new qg.l(lVar);
        qg.l<y2.c0> lVar3 = this.f22459i0;
        qg.l lVar4 = new qg.l(lVar3);
        lVar4.addLast(B());
        int length = this.G.length() + this.f22463k0;
        c(c0VarRemoveLast, true);
        lVar3.addAll(lVar4);
        this.f22463k0 = length;
        lVar.addAll(lVar2);
        this.f22443a.invoke(B());
    }

    public final void s() {
        y2.c0 c0VarB = B();
        t2.b bVar = c0VarB.f33682a;
        qg.l<y2.c0> lVar = this.f22459i0;
        y2.c0 c0VarK = lVar.k();
        if (kotlin.jvm.internal.r.a(c0VarK != null ? c0VarK.f33682a.f27761b : null, bVar.f27761b)) {
            return;
        }
        lVar.addLast(c0VarB);
        this.f22463k0 = bVar.f27761b.length() + this.f22463k0;
        while (true) {
            if (lVar.c() <= 40 && (this.f22463k0 <= 8000000 || lVar.c() <= 1)) {
                break;
            } else {
                this.f22463k0 -= lVar.removeFirst().f33682a.f27761b.length();
            }
        }
        this.f22461j0.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void scrollTo(int i10, int i11) {
        int iCeil;
        l lVar = this.O;
        boolean z10 = this.f22480z;
        float f10 = this.f22478x;
        if (!z10) {
            iCeil = (int) Math.ceil(((2 * f10) + ((lVar != null ? lVar.f22288f : CropImageView.DEFAULT_ASPECT_RATIO) + this.f22479y)) - getWidth());
            if (iCeil < 0) {
                iCeil = 0;
            }
        }
        int iCeil2 = (int) Math.ceil(((f10 * 2) + ((lVar != null ? lVar.f22284b.length : 1) * getLineHeight())) - getHeight());
        if (iCeil2 < 0) {
            iCeil2 = 0;
        }
        this.T = jh.j.m(i10, 0, iCeil);
        this.U = jh.j.m(i11, 0, iCeil2);
        invalidate();
        awakenScrollBars();
    }

    public final void setCaretColor(int i10) {
        this.f22451e = i10;
    }

    public final void setCurrentLineColor(int i10) {
        this.f22462k = i10;
    }

    public final void setCurrentNumberColor(int i10) {
        this.f22464l = i10;
    }

    public final void setGutterColor(int i10) {
        this.f22445b = i10;
    }

    public final void setNumberColor(int i10) {
        this.f22447c = i10;
    }

    public final void setOnCaretInfo(eh.q<? super Integer, ? super Integer, ? super Integer, pg.f0> qVar) {
        this.f22460j = qVar;
    }

    public final void setOnRedoRequest(eh.a<pg.f0> aVar) {
        this.f22455g = aVar;
    }

    public final void setOnSaveRequest(eh.a<pg.f0> aVar) {
        this.f22457h = aVar;
    }

    public final void setOnUndoRequest(eh.a<pg.f0> aVar) {
        this.f22453f = aVar;
    }

    public final void setOnValue(eh.l<? super y2.c0, pg.f0> lVar) {
        kotlin.jvm.internal.r.e(lVar, "<set-?>");
        this.f22443a = lVar;
    }

    public final void setSelectionColor(int i10) {
        this.f22449d = i10;
    }

    public final void setSmartTyping(boolean z10) {
        this.f22466m = z10;
    }

    public final void setSyntaxColors(int[] iArr) {
        if (Arrays.equals(this.f22468n, iArr)) {
            return;
        }
        boolean z10 = (this.f22468n == null) != (iArr == null);
        this.f22468n = iArr;
        this.f22465l0.clear();
        if (z10) {
            q();
        } else {
            invalidate();
        }
    }

    public final void setTextColor(int i10) {
        TextPaint textPaint = this.f22476v;
        if (textPaint.getColor() != i10) {
            textPaint.setColor(i10);
            invalidate();
        }
    }

    public final void t(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = this.H;
        int iMin = Math.min(getSelectionStart(), getSelectionEnd());
        int iMax = Math.max(getSelectionStart(), getSelectionEnd());
        int i10 = this.D;
        this.D = i10 + 1;
        if (i10 == 0) {
            s();
        }
        try {
            BaseInputConnection.removeComposingSpans(spannableStringBuilder);
            spannableStringBuilder.replace(iMin, iMax, charSequence);
            Selection.setSelection(spannableStringBuilder, iMin + charSequence.length());
        } finally {
            g();
        }
    }

    public final void u() {
        l lVar;
        eh.q<? super Integer, ? super Integer, ? super Integer, pg.f0> qVar = this.f22460j;
        if (qVar == null || (lVar = this.O) == null) {
            return;
        }
        int[] iArr = lVar.f22286d;
        int[] iArr2 = lVar.f22284b;
        if (lVar.f22283a != this.G || iArr2.length == 0) {
            return;
        }
        int i10 = 0;
        int iM = jh.j.m(getSelectionEnd(), 0, this.G.length());
        int i11 = iArr[lVar.b(iM)];
        int length = iArr2.length - 1;
        while (i10 < length) {
            int i12 = (i10 + length) >>> 1;
            if (iArr[i12] < i11) {
                i10 = i12 + 1;
            } else {
                length = i12;
            }
        }
        int i13 = (iM - iArr2[i10]) + 1;
        int i14 = iArr[iArr2.length - 1];
        if (i11 == this.f22473r && i13 == this.f22474s && i14 == this.f22475t) {
            return;
        }
        this.f22473r = i11;
        this.f22474s = i13;
        this.f22475t = i14;
        qVar.b(Integer.valueOf(i11), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public final a v(int i10, int i11, int i12) {
        int i13;
        String str;
        l lVar = this.O;
        kotlin.jvm.internal.r.b(lVar);
        String str2 = lVar.f22283a;
        pg.n nVar = new pg.n(Integer.valueOf(i11), Integer.valueOf(i12));
        g gVar = this.f22465l0;
        Object aVar = gVar.get(nVar);
        if (aVar == null) {
            String strSubstring = str2.substring(i11, i12);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strSubstring);
            TextPaint textPaint = this.f22476v;
            float fMeasureText = textPaint.measureText(" ") * 4;
            if (mh.x.s(strSubstring, '\t')) {
                int i14 = 1;
                i13 = 1;
                while (i14 < 513) {
                    spannableStringBuilder.setSpan(new TabStopSpan.Standard((int) (i14 * fMeasureText)), 0, strSubstring.length(), 33);
                    i14++;
                    fMeasureText = fMeasureText;
                }
            } else {
                i13 = 1;
            }
            int[] iArr = this.f22468n;
            z0.a aVar2 = this.f22471p;
            if (iArr != null && aVar2 != null && (str = aVar2.f22506a) == str2) {
                Set<String> set = z0.f22504a;
                int iM = jh.j.m(i11, 0, str.length());
                int i15 = iM / 256;
                int[] iArr2 = aVar2.f22507b;
                int length = iArr2.length - 1;
                if (i15 > length) {
                    i15 = length;
                }
                int iG = iArr2[i15];
                for (int i16 = i15 * 256; i16 < iM; i16++) {
                    iG = (int) (z0.g(str, i16, iG) >>> 8);
                }
                int i17 = i11;
                int i18 = 0;
                int i19 = i17;
                while (i17 < i12) {
                    long jG = z0.g(str, i17, iG);
                    String str3 = str;
                    int i20 = (int) (jG >>> 8);
                    int i21 = (int) (jG & 255);
                    if (i21 != i18) {
                        if (i18 != 0 && i17 > i19) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(iArr[i18]), i19 - i11, i17 - i11, 33);
                        }
                        i19 = i17;
                        i18 = i21;
                    }
                    i17++;
                    str = str3;
                    iG = i20;
                }
                if (i18 != 0 && i12 > i19) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(iArr[i18]), i19 - i11, i12 - i11, 33);
                }
            }
            float fMax = Math.max(textPaint.measureText(strSubstring), lVar.c(i10, i12) - lVar.c(i10, i11));
            int length2 = spannableStringBuilder.length();
            int iCeil = (int) Math.ceil((textPaint.getTextSize() * 2) + fMax);
            int i22 = i13;
            if (iCeil < i22) {
                iCeil = i22;
            }
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableStringBuilder, 0, length2, textPaint, iCeil).setIncludePad(false).setMaxLines(i22).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
            kotlin.jvm.internal.r.d(staticLayoutBuild, "build(...)");
            aVar = new a(i11, i12, staticLayoutBuild, lVar.c(i10, i11));
            gVar.put(nVar, aVar);
        }
        return (a) aVar;
    }

    public final void w(int i10, int i11, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = this.H;
        this.B = true;
        try {
            Selection.setSelection(spannableStringBuilder, jh.j.m(i10, 0, spannableStringBuilder.length()), jh.j.m(i11, 0, spannableStringBuilder.length()));
            this.B = false;
            this.S = z10;
            p();
            if (z10) {
                h();
            }
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }

    public final boolean y() {
        if (this.f22466m && !this.N && getSelectionStart() == getSelectionEnd()) {
            String str = this.G;
            int selectionEnd = getSelectionEnd();
            if (selectionEnd > 0 && selectionEnd < str.length()) {
                int i10 = selectionEnd - 1;
                char cCharAt = str.charAt(i10);
                char cCharAt2 = str.charAt(selectionEnd);
                StringBuilder sb = new StringBuilder();
                sb.append(cCharAt);
                sb.append(cCharAt2);
                if (qg.p.j("()", "[]", "{}", "\"\"", "''").contains(sb.toString())) {
                    this.B = true;
                    try {
                        Selection.setSelection(this.H, i10, selectionEnd + 1);
                        this.B = false;
                        t("");
                        return true;
                    } catch (Throwable th2) {
                        this.B = false;
                        throw th2;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(String str) {
        String strSubstring;
        Integer numValueOf;
        int i10;
        char c10;
        if (!this.f22466m || this.N || str.length() != 1) {
            return false;
        }
        String str2 = this.G;
        int iM = jh.j.m(Math.min(getSelectionStart(), getSelectionEnd()), 0, str2.length());
        int iM2 = jh.j.m(Math.max(getSelectionStart(), getSelectionEnd()), iM, str2.length());
        char cCharAt = str.charAt(0);
        char cCharAt2 = iM > 0 ? str2.charAt(iM - 1) : (char) 0;
        char cCharAt3 = iM2 < str2.length() ? str2.charAt(iM2) : (char) 0;
        char c11 = ' ';
        char c12 = '}';
        if (cCharAt == '\n') {
            int i11 = iM;
            for (char c13 = '\n'; i11 > 0 && str2.charAt(i11 - 1) != c13 && iM - i11 < 4096; c13 = '\n') {
                i11--;
            }
            int i12 = i11;
            while (i12 < iM) {
                if (str2.charAt(i12) != c11) {
                    c10 = c11;
                    if (str2.charAt(i12) != '\t') {
                        break;
                    }
                } else {
                    c10 = c11;
                }
                if (i12 - i11 >= 256) {
                    break;
                }
                i12++;
                c11 = c10;
            }
            String strSubstring2 = str2.substring(i11, i12);
            kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
            boolean z10 = cCharAt2 == '{' || cCharAt2 == '(' || cCharAt2 == '[' || (cCharAt2 == '>' && o(iM + (-1), str2) != null);
            boolean z11 = (cCharAt2 == '{' && cCharAt3 == '}') || (cCharAt2 == '(' && cCharAt3 == ')') || ((cCharAt2 == '[' && cCharAt3 == ']') || (cCharAt2 == '>' && cCharAt3 == '<' && (i10 = iM2 + 1) < str2.length() && str2.charAt(i10) == '/'));
            if (z10 && z11) {
                j(strSubstring2.length() + iM + 3, b6.a.b("\n", strSubstring2, "  \n", strSubstring2));
                return true;
            }
            if (z10) {
                j(strSubstring2.length() + iM + 3, i8.n.d("\n", strSubstring2, "  "));
                return true;
            }
            if (strSubstring2.length() > 0) {
                j(strSubstring2.length() + iM + 1, "\n".concat(strSubstring2));
                return true;
            }
        } else {
            if (iM2 > iM) {
                strSubstring = str2.substring(iM, iM2);
                kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            if (cCharAt == '\"') {
                if (strSubstring.length() == 0 && cCharAt3 == cCharAt) {
                    x(this, iM + 1, 0, 6);
                    return true;
                }
                if (strSubstring.length() > 0) {
                    j(strSubstring.length() + iM + 2, cCharAt + strSubstring + cCharAt);
                    return true;
                }
                Integer numA = A(iM);
                if (numA != null) {
                    int iIntValue = numA.intValue();
                    Set<String> set = z0.f22504a;
                    numValueOf = Integer.valueOf(iIntValue & 31);
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null && numValueOf.intValue() == 2 ? cCharAt2 == '=' : !((numValueOf != null && numValueOf.intValue() == 8) || (numValueOf != null && numValueOf.intValue() == 14) ? Character.isLetterOrDigit(cCharAt2) || (cCharAt3 != 0 && !g8.w.j(cCharAt3) && !mh.x.s(")]};,", cCharAt3)) : numValueOf != null || cCharAt2 != '=')) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cCharAt);
                    sb.append(cCharAt);
                    j(iM + 1, sb.toString());
                    return true;
                }
            } else if (cCharAt != '>') {
                if (cCharAt == '[') {
                    if (cCharAt == '(') {
                        c12 = ')';
                    } else if (cCharAt == '[') {
                        c12 = ']';
                    }
                    if (strSubstring.length() > 0) {
                        j(strSubstring.length() + iM + 2, cCharAt + strSubstring + c12);
                        return true;
                    }
                    if (cCharAt3 == 0 || g8.w.j(cCharAt3) || mh.x.s(")]};,<", cCharAt3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cCharAt);
                        sb2.append(c12);
                        j(iM + 1, sb2.toString());
                        return true;
                    }
                } else if (cCharAt == ']') {
                    if (strSubstring.length() == 0 && cCharAt3 == cCharAt) {
                        x(this, iM + 1, 0, 6);
                        return true;
                    }
                } else if (cCharAt != '{') {
                    if (cCharAt != '}') {
                        switch (cCharAt) {
                        }
                    }
                }
            } else if (strSubstring.length() <= 0) {
                Integer numA2 = A(iM);
                if (numA2 != null) {
                    List listJ = qg.p.j(1, 2);
                    Set<String> set2 = z0.f22504a;
                    if (listJ.contains(Integer.valueOf(numA2.intValue() & 31)) && (numA2.intValue() & 32) == 0) {
                        String strO = o(iM, str2);
                        if (strO != null) {
                            String strD = i8.n.d("</", strO, ">");
                            if (!mh.t.k(iM2, 0, strD.length(), str2, strD, true)) {
                                j(iM + 1, ">".concat(strD));
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final class g extends LinkedHashMap<pg.n<? extends Integer, ? extends Integer>, a> {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof pg.n) {
                return super.containsKey((pg.n) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof a) {
                return super.containsValue((a) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof pg.n) {
                return (a) super.get((pg.n) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof pg.n) ? obj2 : (a) super.getOrDefault((pg.n) obj, (a) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof pg.n) {
                return (a) super.remove((pg.n) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<pg.n<? extends Integer, ? extends Integer>, a> entry) {
            return super.size() > 64;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof pg.n) && (obj2 instanceof a)) {
                return super.remove((pg.n) obj, (a) obj2);
            }
            return false;
        }
    }
}
