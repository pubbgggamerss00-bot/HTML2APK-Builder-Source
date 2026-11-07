package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import ed.v;
import gd.g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sc.c;
import sc.h;
import sc.i;
import sc.j;
import sc.r;
import xc.d;
import yc.a;

/* loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String NULL_VALUE = "__NULL__";
    private static final String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final String mFileName;
    final c mKeyDeterministicAead;
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new CopyOnWriteArrayList<>();
    final String mMasterKeyAlias;
    final SharedPreferences mSharedPreferences;
    final sc.a mValueAead;

    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType = iArr;
            try {
                iArr[EncryptedType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class Editor implements SharedPreferences.Editor {
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private final AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final List<String> mKeysChanged = new CopyOnWriteArrayList();

        public Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String str : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(str) && !this.mEncryptedSharedPreferences.isReservedKey(str)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                    }
                }
            }
        }

        private void notifyListeners() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.mEncryptedSharedPreferences.mListeners.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator<String> it2 = this.mKeysChanged.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, it2.next());
                }
            }
        }

        private void putEncryptedObject(String str, byte[] bArr) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(k3.a.a(str, " is a reserved key for the encryption keyset."));
            }
            this.mKeysChanged.add(str);
            if (str == null) {
                str = EncryptedSharedPreferences.NULL_VALUE;
            }
            try {
                Pair<String, String> pairEncryptKeyValuePair = this.mEncryptedSharedPreferences.encryptKeyValuePair(str, bArr);
                this.mEditor.putString((String) pairEncryptKeyValuePair.first, (String) pairEncryptKeyValuePair.second);
            } catch (GeneralSecurityException e10) {
                throw new SecurityException(a.a(e10, new StringBuilder("Could not encrypt data: ")), e10);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(EncryptedType.BOOLEAN.getId());
            byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EncryptedType.FLOAT.getId());
            byteBufferAllocate.putFloat(f10);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EncryptedType.INT.getId());
            byteBufferAllocate.putInt(i10);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(EncryptedType.LONG.getId());
            byteBufferAllocate.putLong(j10);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(EncryptedType.STRING.getId());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            int i10 = 0;
            Set<String> set2 = set;
            if (set == null) {
                p.b bVar = new p.b(0);
                bVar.add(EncryptedSharedPreferences.NULL_VALUE);
                set2 = bVar;
            }
            ArrayList arrayList = new ArrayList(set2.size());
            int size = set2.size() * 4;
            Iterator<String> it = set2.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(EncryptedType.STRING_SET.getId());
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj = arrayList.get(i10);
                i10++;
                byte[] bArr = (byte[]) obj;
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(k3.a.a(str, " is a reserved key for the encryption keyset."));
            }
            this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
            this.mKeysChanged.add(str);
            return this;
        }
    }

    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        EncryptedType(int i10) {
            this.mId = i10;
        }

        public static EncryptedType fromId(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum PrefKeyEncryptionScheme {
        AES256_SIV("AES256_SIV");

        private final String mDeterministicAeadKeyTemplateName;

        PrefKeyEncryptionScheme(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        public h getKeyTemplate() throws GeneralSecurityException {
            return i.a(this.mDeterministicAeadKeyTemplateName);
        }
    }

    public enum PrefValueEncryptionScheme {
        AES256_GCM("AES256_GCM");

        private final String mAeadKeyTemplateName;

        PrefValueEncryptionScheme(String str) {
            this.mAeadKeyTemplateName = str;
        }

        public h getKeyTemplate() throws GeneralSecurityException {
            return i.a(this.mAeadKeyTemplateName);
        }
    }

    public EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, sc.a aVar, c cVar) {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mMasterKeyAlias = str2;
        this.mValueAead = aVar;
        this.mKeyDeterministicAead = cVar;
    }

    public static SharedPreferences create(Context context, String str, MasterKey masterKey, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        return create(str, masterKey.getKeyAlias(), context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    private Object getDecryptedObject(String str) throws SecurityException {
        if (isReservedKey(str)) {
            throw new SecurityException(k3.a.a(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            String strEncryptKey = encryptKey(str);
            String string = this.mSharedPreferences.getString(strEncryptKey, null);
            if (string != null) {
                byte[] bArrA = g.a(string);
                sc.a aVar = this.mValueAead;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.decrypt(bArrA, strEncryptKey.getBytes(charset)));
                byteBufferWrap.position(0);
                int i10 = byteBufferWrap.getInt();
                EncryptedType encryptedTypeFromId = EncryptedType.fromId(i10);
                if (encryptedTypeFromId == null) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
                }
                switch (AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[encryptedTypeFromId.ordinal()]) {
                    case 1:
                        int i11 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                        byteBufferWrap.limit(i11);
                        String string2 = charset.decode(byteBufferSlice).toString();
                        if (!string2.equals(NULL_VALUE)) {
                            return string2;
                        }
                        break;
                    case 2:
                        return Integer.valueOf(byteBufferWrap.getInt());
                    case 3:
                        return Long.valueOf(byteBufferWrap.getLong());
                    case 4:
                        return Float.valueOf(byteBufferWrap.getFloat());
                    case 5:
                        return Boolean.valueOf(byteBufferWrap.get() != 0);
                    case 6:
                        p.b bVar = new p.b(0);
                        while (byteBufferWrap.hasRemaining()) {
                            int i12 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                            byteBufferSlice2.limit(i12);
                            byteBufferWrap.position(byteBufferWrap.position() + i12);
                            bVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                        }
                        if (bVar.f20570c != 1 || !NULL_VALUE.equals(bVar.f20569b[0])) {
                            return bVar;
                        }
                        break;
                        break;
                    default:
                        throw new SecurityException("Unhandled type for encrypted pref value: " + encryptedTypeFromId);
                }
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException(a.a(e10, new StringBuilder("Could not decrypt value. ")), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(k3.a.a(str, " is a reserved key for the encryption keyset."));
        }
        return this.mSharedPreferences.contains(encryptKey(str));
    }

    public String decryptKey(String str) {
        try {
            String str2 = new String(this.mKeyDeterministicAead.b(g.a(str), this.mFileName.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals(NULL_VALUE)) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException(a.a(e10, new StringBuilder("Could not decrypt key. ")), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    public String encryptKey(String str) {
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            try {
                return new String(g.b(this.mKeyDeterministicAead.a(str.getBytes(StandardCharsets.UTF_8), this.mFileName.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new SecurityException(a.a(e11, new StringBuilder("Could not encrypt key. ")), e11);
        }
    }

    public Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) throws GeneralSecurityException {
        String strEncryptKey = encryptKey(str);
        try {
            return new Pair<>(strEncryptKey, new String(g.b(this.mValueAead.a(bArr, strEncryptKey.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey(entry.getKey())) {
                String strDecryptKey = decryptKey(entry.getKey());
                map.put(strDecryptKey, getDecryptedObject(strDecryptKey));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) throws SecurityException {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Boolean ? ((Boolean) decryptedObject).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) throws SecurityException {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Float ? ((Float) decryptedObject).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) throws SecurityException {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Integer ? ((Integer) decryptedObject).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) throws SecurityException {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Long ? ((Long) decryptedObject).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) throws SecurityException {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof String ? (String) decryptedObject : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) throws SecurityException {
        Object decryptedObject = getDecryptedObject(str);
        Set<String> bVar = decryptedObject instanceof Set ? (Set) decryptedObject : new p.b<>(0);
        return bVar.size() > 0 ? bVar : set;
    }

    public boolean isReservedKey(String str) {
        return KEY_KEYSET_ALIAS.equals(str) || VALUE_KEYSET_ALIAS.equals(str);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }

    @Deprecated
    public static SharedPreferences create(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        j jVarC;
        j jVarC2;
        int i10 = xc.c.f33539a;
        r.g(d.f33541b);
        if (!wc.a.a()) {
            r.e(new xc.b(v.class, new xc.a(c.class)), true);
        }
        tc.a.a();
        Context applicationContext = context.getApplicationContext();
        a.C0348a c0348a = new a.C0348a();
        c0348a.f34378f = prefKeyEncryptionScheme.getKeyTemplate();
        c0348a.h(applicationContext, KEY_KEYSET_ALIAS, str);
        c0348a.g("android-keystore://" + str2);
        yc.a aVarA = c0348a.a();
        synchronized (aVarA) {
            jVarC = aVarA.f34372a.c();
        }
        a.C0348a c0348a2 = new a.C0348a();
        c0348a2.f34378f = prefValueEncryptionScheme.getKeyTemplate();
        c0348a2.h(applicationContext, VALUE_KEYSET_ALIAS, str);
        c0348a2.g("android-keystore://" + str2);
        yc.a aVarA2 = c0348a2.a();
        synchronized (aVarA2) {
            jVarC2 = aVarA2.f34372a.c();
        }
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (sc.a) jVarC2.b(sc.a.class), (c) jVarC.b(c.class));
    }
}
