package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.h0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u0.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f13400e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f13401f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13402a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13403b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f13404c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13405d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f13406c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f13407a;

        /* renamed from: b, reason: collision with root package name */
        public Method f13408b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object obj = this.f13407a;
            Method method = this.f13408b;
            try {
                if (method.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a, reason: collision with root package name */
        public final Menu f13409a;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public int f13416i;

        /* renamed from: j, reason: collision with root package name */
        public int f13417j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f13418k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f13419l;

        /* renamed from: m, reason: collision with root package name */
        public int f13420m;

        /* renamed from: n, reason: collision with root package name */
        public char f13421n;

        /* renamed from: o, reason: collision with root package name */
        public int f13422o;

        /* renamed from: p, reason: collision with root package name */
        public char f13423p;

        /* renamed from: q, reason: collision with root package name */
        public int f13424q;

        /* renamed from: r, reason: collision with root package name */
        public int f13425r;
        public boolean s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f13426t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f13427u;

        /* renamed from: v, reason: collision with root package name */
        public int f13428v;

        /* renamed from: w, reason: collision with root package name */
        public int f13429w;

        /* renamed from: x, reason: collision with root package name */
        public String f13430x;

        /* renamed from: y, reason: collision with root package name */
        public String f13431y;

        /* renamed from: z, reason: collision with root package name */
        public u0.b f13432z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b, reason: collision with root package name */
        public int f13410b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f13411c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f13412d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f13413e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f13414f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f13415g = true;

        public b(Menu menu) {
            this.f13409a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f13404c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e6) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
                return null;
            }
        }

        public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            f fVar = f.this;
            Context context = fVar.f13404c;
            boolean z6 = false;
            menuItem.setChecked(this.s).setVisible(this.f13426t).setEnabled(this.f13427u).setCheckable(this.f13425r >= 1).setTitleCondensed(this.f13419l).setIcon(this.f13420m);
            int i6 = this.f13428v;
            if (i6 >= 0) {
                menuItem.setShowAsAction(i6);
            }
            if (this.f13431y != null) {
                if (context.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (fVar.f13405d == null) {
                    fVar.f13405d = f.a(context);
                }
                Object obj = fVar.f13405d;
                String str = this.f13431y;
                a aVar = new a();
                aVar.f13407a = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.f13408b = cls.getMethod(str, a.f13406c);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e6) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                    inflateException.initCause(e6);
                    throw inflateException;
                }
            }
            if (this.f13425r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) menuItem;
                    hVar.f215x = (hVar.f215x & (-5)) | 4;
                } else if (menuItem instanceof k.c) {
                    k.c cVar = (k.c) menuItem;
                    o0.b bVar = cVar.f13523d;
                    try {
                        if (cVar.f13524e == null) {
                            cVar.f13524e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f13524e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception e7) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
                    }
                }
            }
            String str2 = this.f13430x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, f.f13400e, fVar.f13402a));
                z6 = true;
            }
            int i7 = this.f13429w;
            if (i7 > 0) {
                if (z6) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i7);
                }
            }
            u0.b bVar2 = this.f13432z;
            if (bVar2 != null) {
                if (menuItem instanceof o0.b) {
                    ((o0.b) menuItem).b(bVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z7 = menuItem instanceof o0.b;
            if (z7) {
                ((o0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.b(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z7) {
                ((o0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.f(menuItem, charSequence2);
            }
            char c7 = this.f13421n;
            int i8 = this.f13422o;
            if (z7) {
                ((o0.b) menuItem).setAlphabeticShortcut(c7, i8);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.a(menuItem, c7, i8);
            }
            char c8 = this.f13423p;
            int i9 = this.f13424q;
            if (z7) {
                ((o0.b) menuItem).setNumericShortcut(c8, i9);
            } else if (Build.VERSION.SDK_INT >= 26) {
                k.e(menuItem, c8, i9);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z7) {
                    ((o0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    k.d(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z7) {
                    ((o0.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    k.c(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f13400e = clsArr;
        f13401f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f13404c = context;
        Object[] objArr = {context};
        this.f13402a = objArr;
        this.f13403b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int i6;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i6 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        while (!z6) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i6) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z6 = z6;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z7 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z7 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            bVar.f13410b = 0;
                            bVar.f13411c = 0;
                            bVar.f13412d = 0;
                            bVar.f13413e = 0;
                            bVar.f13414f = true;
                            bVar.f13415g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.h) {
                                u0.b bVar2 = bVar.f13432z;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.h = true;
                                    bVar.b(bVar.f13409a.add(bVar.f13410b, bVar.f13416i, bVar.f13417j, bVar.f13418k));
                                } else {
                                    bVar.h = true;
                                    bVar.b(bVar.f13409a.addSubMenu(bVar.f13410b, bVar.f13416i, bVar.f13417j, bVar.f13418k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z6 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z6 = z6;
                    }
                }
                eventType = xmlPullParser2.next();
                i6 = 2;
                z6 = z6;
                z7 = z7;
            } else {
                if (!z7) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f13404c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12948p);
                        bVar.f13410b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        bVar.f13411c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        bVar.f13412d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        bVar.f13413e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        bVar.f13414f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        bVar.f13415g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f12949q);
                            bVar.f13416i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            bVar.f13417j = (typedArrayObtainStyledAttributes2.getInt(5, bVar.f13411c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, bVar.f13412d) & 65535);
                            bVar.f13418k = typedArrayObtainStyledAttributes2.getText(7);
                            bVar.f13419l = typedArrayObtainStyledAttributes2.getText(8);
                            bVar.f13420m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            bVar.f13421n = string == null ? (char) 0 : string.charAt(0);
                            bVar.f13422o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            bVar.f13423p = string2 == null ? (char) 0 : string2.charAt(0);
                            bVar.f13424q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                bVar.f13425r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                bVar.f13425r = bVar.f13413e;
                            }
                            bVar.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            bVar.f13426t = typedArrayObtainStyledAttributes2.getBoolean(4, bVar.f13414f);
                            bVar.f13427u = typedArrayObtainStyledAttributes2.getBoolean(1, bVar.f13415g);
                            bVar.f13428v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            bVar.f13431y = typedArrayObtainStyledAttributes2.getString(12);
                            bVar.f13429w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            bVar.f13430x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z8 = string3 != null;
                            if (z8 && bVar.f13429w == 0 && bVar.f13430x == null) {
                                bVar.f13432z = (u0.b) bVar.a(string3, f13401f, this.f13403b);
                            } else {
                                if (z8) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                bVar.f13432z = null;
                            }
                            bVar.A = typedArrayObtainStyledAttributes2.getText(17);
                            bVar.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                bVar.D = h0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), bVar.D);
                            } else {
                                bVar.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = k0.a.b(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                bVar.C = colorStateList;
                            } else {
                                bVar.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            bVar.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            bVar.h = true;
                            SubMenu subMenuAddSubMenu = bVar.f13409a.addSubMenu(bVar.f13410b, bVar.f13416i, bVar.f13417j, bVar.f13418k);
                            bVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z7 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i6 = 2;
                        z6 = z6;
                        z7 = z7;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z6 = z6;
            }
            eventType = xmlPullParser2.next();
            i6 = 2;
            z6 = z6;
            z7 = z7;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i6, Menu menu) {
        if (!(menu instanceof o0.a)) {
            super.inflate(i6, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z6 = false;
        try {
            try {
                layout = this.f13404c.getResources().getLayout(i6);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.f) {
                    androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) menu;
                    if (!fVar.f184p) {
                        fVar.w();
                        z6 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z6) {
                    ((androidx.appcompat.view.menu.f) menu).v();
                }
                layout.close();
            } catch (IOException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            } catch (XmlPullParserException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th) {
            if (z6) {
                ((androidx.appcompat.view.menu.f) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
