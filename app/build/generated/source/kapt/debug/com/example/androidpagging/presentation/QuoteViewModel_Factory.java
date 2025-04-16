package com.example.androidpagging.presentation;

import com.example.androidpagging.domain.repository.QuoteRepository;
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
public final class QuoteViewModel_Factory implements Factory<QuoteViewModel> {
  private final Provider<QuoteRepository> quoteRepositoryProvider;

  public QuoteViewModel_Factory(Provider<QuoteRepository> quoteRepositoryProvider) {
    this.quoteRepositoryProvider = quoteRepositoryProvider;
  }

  @Override
  public QuoteViewModel get() {
    return newInstance(quoteRepositoryProvider.get());
  }

  public static QuoteViewModel_Factory create(Provider<QuoteRepository> quoteRepositoryProvider) {
    return new QuoteViewModel_Factory(quoteRepositoryProvider);
  }

  public static QuoteViewModel newInstance(QuoteRepository quoteRepository) {
    return new QuoteViewModel(quoteRepository);
  }
}
