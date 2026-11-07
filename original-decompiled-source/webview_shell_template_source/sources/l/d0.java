package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f13604l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static final ConcurrentHashMap<String, Method> f13605m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public int f13606a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13607b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f13608c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f13609d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f13610e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f13611f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f13612g = false;
    public TextPaint h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f13613i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f13614j;

    /* renamed from: k, reason: collision with root package name */
    public final b f13615k;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i6, int i7, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i6);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i7 == -1) {
                i7 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i7);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends d {
        @Override // l.d0.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) d0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends b {
        @Override // l.d0.b, l.d0.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // l.d0.d
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) d0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public d0(TextView textView) {
        this.f13613i = textView;
        this.f13614j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13615k = new c();
        } else {
            this.f13615k = new b();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr) {
                if (i6 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i6)) < 0) {
                    arrayList.add(Integer.valueOf(i6));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr2[i7] = ((Integer) arrayList.get(i7)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) throws SecurityException {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f13605m;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static <T> T e(Object obj, String str, T t6) {
        try {
            return (T) d(str).invoke(obj, null);
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
            return t6;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f13607b) {
                if (this.f13613i.getMeasuredHeight() <= 0 || this.f13613i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f13615k.b(this.f13613i) ? 1048576 : (this.f13613i.getMeasuredWidth() - this.f13613i.getTotalPaddingLeft()) - this.f13613i.getTotalPaddingRight();
                int height = (this.f13613i.getHeight() - this.f13613i.getCompoundPaddingBottom()) - this.f13613i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f13604l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f13613i.getTextSize()) {
                            g(fC, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f13607b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f13611f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i6 = length - 1;
        int i7 = 0;
        int i8 = 1;
        while (i8 <= i6) {
            int i9 = (i8 + i6) / 2;
            int i10 = this.f13611f[i9];
            TextView textView = this.f13613i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i10);
            StaticLayout staticLayoutA = a.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f13613i, this.h, this.f13615k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i11 = i9 + 1;
                i7 = i8;
                i8 = i11;
            } else {
                i7 = i9 - 1;
                i6 = i7;
            }
        }
        return this.f13611f[i7];
    }

    public final boolean f() {
        return j() && this.f13606a != 0;
    }

    public final void g(float f6, int i6) {
        Context context = this.f13614j;
        float fApplyDimension = TypedValue.applyDimension(i6, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f13613i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f13607b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f13606a == 1) {
            if (!this.f13612g || this.f13611f.length == 0) {
                int iFloor = ((int) Math.floor((this.f13610e - this.f13609d) / this.f13608c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i6 = 0; i6 < iFloor; i6++) {
                    iArr[i6] = Math.round((i6 * this.f13608c) + this.f13609d);
                }
                this.f13611f = b(iArr);
            }
            this.f13607b = true;
        } else {
            this.f13607b = false;
        }
        return this.f13607b;
    }

    public final boolean i() {
        boolean z6 = this.f13611f.length > 0;
        this.f13612g = z6;
        if (z6) {
            this.f13606a = 1;
            this.f13609d = r0[0];
            this.f13610e = r0[r1 - 1];
            this.f13608c = -1.0f;
        }
        return z6;
    }

    public final boolean j() {
        return !(this.f13613i instanceof k);
    }

    public final void k(float f6, float f7, float f8) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f7 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
        }
        this.f13606a = 1;
        this.f13609d = f6;
        this.f13610e = f7;
        this.f13608c = f8;
        this.f13612g = false;
    }
}
