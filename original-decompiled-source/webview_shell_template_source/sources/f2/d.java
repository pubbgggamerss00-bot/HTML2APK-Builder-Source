package f2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import f2.g;
import java.io.IOException;
import java.util.ArrayList;
import l0.j;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends f implements Animatable {

    /* renamed from: t, reason: collision with root package name */
    public final b f12990t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f12991u;

    /* renamed from: v, reason: collision with root package name */
    public e f12992v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList<f2.c> f12993w;

    /* renamed from: x, reason: collision with root package name */
    public final a f12994x;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
            d.this.scheduleSelf(runnable, j6);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public g f12995a;

        /* renamed from: b, reason: collision with root package name */
        public AnimatorSet f12996b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f12997c;

        /* renamed from: d, reason: collision with root package name */
        public w.a<Animator, String> f12998d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public d(Context context, int i6) {
        this.f12992v = null;
        this.f12993w = null;
        this.f12994x = new a();
        this.f12991u = context;
        this.f12990t = new b();
    }

    @Override // f2.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f12990t;
        bVar.f12995a.draw(canvas);
        if (bVar.f12996b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getAlpha() : this.f12990t.f12995a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f12990t.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getColorFilter() : this.f12990t.f12995a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.s != null) {
            return new c(this.s.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f12990t.f12995a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f12990t.f12995a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getOpacity() : this.f12990t.f12995a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.f12996b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.f12996b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.f12996b.playTogether(r3.f12997c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            b bVar = this.f12990t;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayC = j.c(resources, theme, attributeSet, f2.a.f12986e);
                    int resourceId = typedArrayC.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVar = new g();
                        ThreadLocal<TypedValue> threadLocal = l0.f.f13795a;
                        gVar.s = resources.getDrawable(resourceId, theme);
                        new g.h(gVar.s.getConstantState());
                        gVar.f13006x = false;
                        gVar.setCallback(this.f12994x);
                        g gVar2 = bVar.f12995a;
                        if (gVar2 != null) {
                            gVar2.setCallback(null);
                        }
                        bVar.f12995a = gVar;
                    }
                    typedArrayC.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, f2.a.f12987f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f12991u;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(bVar.f12995a.f13002t.f13048b.f13046o.get(string));
                        if (bVar.f12997c == null) {
                            bVar.f12997c = new ArrayList<>();
                            bVar.f12998d = new w.a<>();
                        }
                        bVar.f12997c.add(animatorLoadAnimator);
                        bVar.f12998d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.isAutoMirrored() : this.f12990t.f12995a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.s;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f12990t.f12996b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.isStateful() : this.f12990t.f12995a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f12990t.f12995a.setBounds(rect);
        }
    }

    @Override // f2.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        Drawable drawable = this.s;
        return drawable != null ? drawable.setLevel(i6) : this.f12990t.f12995a.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.s;
        return drawable != null ? drawable.setState(iArr) : this.f12990t.f12995a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else {
            this.f12990t.f12995a.setAlpha(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f12990t.f12995a.setAutoMirrored(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12990t.f12995a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            n0.a.a(drawable, i6);
        } else {
            this.f12990t.f12995a.setTint(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f12990t.f12995a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f12990t.f12995a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.setVisible(z6, z7);
        }
        this.f12990t.f12995a.setVisible(z6, z7);
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f12990t;
        if (bVar.f12996b.isStarted()) {
            return;
        }
        bVar.f12996b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f12990t.f12996b.end();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f12999a;

        public c(Drawable.ConstantState constantState) {
            this.f12999a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f12999a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f12999a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f12999a.newDrawable();
            dVar.s = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f12994x);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f12999a.newDrawable(resources);
            dVar.s = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f12994x);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f12999a.newDrawable(resources, theme);
            dVar.s = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f12994x);
            return dVar;
        }
    }

    public d() {
        this(null, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
