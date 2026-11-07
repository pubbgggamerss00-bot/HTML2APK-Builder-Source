package {{packageName}}

import java.io.InputStream
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec

/**
 * Runtime config obfuscation helper.
 *
 * The generated APK ships its runtime config as an AES-256-GCM encrypted blob
 * instead of plaintext JSON. The key is reconstructed at runtime from several
 * byte arrays so no single literal key string exists in the DEX.
 *
 * This is obfuscation, not perfect security: a determined reverse engineer can
 * still extract the key from the APK. It is only meant to stop casual ZIP edits.
 */
object ConfigCrypto {

    private const val AES_MODE = "AES/GCM/NoPadding"
    private const val GCM_TAG_BITS = 128
    private const val NONCE_LENGTH = 12
    private const val KEY_LENGTH = 32

    // Three unrelated masks. The real AES key is K1 xor K2 xor K3.
    private val K1 = byteArrayOf(
        0x4e, 0x93.toByte(), 0xe7.toByte(), 0xf5.toByte(), 0xb7.toByte(), 0xdf.toByte(),
        0x8a.toByte(), 0x8a.toByte(), 0x39, 0xa1.toByte(), 0xf2.toByte(), 0xe0.toByte(),
        0x45, 0xff.toByte(), 0x05, 0x07, 0x10, 0x97.toByte(), 0x3f, 0xce.toByte(),
        0xaf.toByte(), 0xf7.toByte(), 0x5c, 0x18, 0x8c.toByte(), 0x8d.toByte(), 0xc3.toByte(),
        0xf1.toByte(), 0xd1.toByte(), 0x0a, 0x3b, 0x7c
    )
    private val K2 = byteArrayOf(
        0xd7.toByte(), 0xfa.toByte(), 0x98.toByte(), 0x91.toByte(), 0x6a, 0x79,
        0x64, 0x81.toByte(), 0xc5.toByte(), 0xb4.toByte(), 0x93.toByte(), 0x38,
        0x14, 0x6d, 0x6e, 0x66, 0x02, 0x65, 0x71, 0x6a, 0x39, 0x7f,
        0xac.toByte(), 0x48, 0x31, 0x5b, 0xdd.toByte(), 0x22, 0x1a, 0xd0.toByte(),
        0x3f, 0x1d
    )
    private val K3 = byteArrayOf(
        0x5d, 0xb4.toByte(), 0x14, 0x20, 0xfc.toByte(), 0xaa.toByte(),
        0xa5.toByte(), 0x50, 0x87.toByte(), 0x97.toByte(), 0x04, 0xde.toByte(),
        0x97.toByte(), 0xc9.toByte(), 0xe8.toByte(), 0xd3.toByte(), 0xfb.toByte(),
        0x5a, 0x4a, 0x98.toByte(), 0x0a, 0xd1.toByte(), 0xa4.toByte(), 0x94.toByte(),
        0x0d, 0x5d, 0x86.toByte(), 0x68, 0x16, 0x64, 0x34, 0xcc.toByte()
    )

    private fun deriveKey(): ByteArray {
        val key = ByteArray(KEY_LENGTH)
        for (i in key.indices) {
            key[i] = (K1[i].toInt() xor K2[i].toInt() xor K3[i].toInt()).toByte()
        }
        return key
    }

    /**
     * Decrypts a config blob produced by the matching encryptor.
     * The blob layout is: nonce (12 bytes) || ciphertext || GCM auth tag.
     */
    fun decryptConfig(input: InputStream): ByteArray {
        val blob = input.use { it.readBytes() }
        require(blob.size >= NONCE_LENGTH + 1) { "Encrypted config is too short" }

        val nonce = blob.copyOfRange(0, NONCE_LENGTH)
        val cipherBytes = blob.copyOfRange(NONCE_LENGTH, blob.size)

        val cipher = Cipher.getInstance(AES_MODE)
        cipher.init(
            Cipher.DECRYPT_MODE,
            SecretKeySpec(deriveKey(), "AES"),
            GCMParameterSpec(GCM_TAG_BITS, nonce)
        )
        return cipher.doFinal(cipherBytes)
    }

    /**
     * Encrypts plaintext config bytes for the builder side.
     * Exposed here so the exported Android project template can reuse it.
     */
    fun encryptConfig(plainText: ByteArray): ByteArray {
        val nonce = ByteArray(NONCE_LENGTH).apply { SecureRandom().nextBytes(this) }
        val cipher = Cipher.getInstance(AES_MODE)
        cipher.init(
            Cipher.ENCRYPT_MODE,
            SecretKeySpec(deriveKey(), "AES"),
            GCMParameterSpec(GCM_TAG_BITS, nonce)
        )
        val cipherBytes = cipher.doFinal(plainText)
        return nonce + cipherBytes
    }
}
