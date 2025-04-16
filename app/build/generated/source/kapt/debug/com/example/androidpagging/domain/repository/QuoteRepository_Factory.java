package com.example.androidpagging.domain.repository;

import com.example.androidpagging.data.QuoteAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class QuoteRepository_Factory implements Factory<QuoteRepository> {
  private final Provider<QuoteAPI> quoteAPIProvider;

  public QuoteRepository_Factory(Provider<QuoteAPI> quoteAPIProvider) {
    this.quoteAPIProvider = quoteAPIProvider;
  }

  @Override
  public QuoteRepository get() {
    return newInstance(quoteAPIProvider.get());
  }

  public static QuoteRepository_Factory create(Provider<QuoteAPI> quoteAPIProvider) {
    return new QuoteRepository_Factory(quoteAPIProvider);
  }

  public static QuoteRepository newInstance(QuoteAPI quoteAPI) {
    return new QuoteRepository(quoteAPI);
  }
}
