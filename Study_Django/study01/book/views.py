from django.views.generic import ListView, DetailView
from django.views.generic.edit import CreateView, UpdateView, DeleteView
from django.urls import reverse_lazy
from .models import Book
from .forms import BookForm
from .book_utils import get_book_cover_by_title

class BookListView(ListView):
    model = Book


class BookDetailView(DetailView):
    model = Book

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        api_key = 'API_KEY' 
        context['cover_url'] = get_book_cover_by_title(self.object.title, api_key)
        return context


class BookCreateView(CreateView):
    model = Book
    form_class = BookForm
    success_url = reverse_lazy('book-list')


class BookUpdateView(UpdateView):
    model = Book
    form_class = BookForm
    template_name_suffix = '_confirm_update'
    success_url = reverse_lazy('book-list')

class BookDeleteView(DeleteView):  
     model=Book 
     success_url=reverse_lazy('book-list')
